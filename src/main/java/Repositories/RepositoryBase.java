package Repositories;

import java.sql.*;
import java.util.List;

public abstract class RepositoryBase<IEntity> implements IRepository<IEntity>{

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private int rowsAffected;
    private String tableName;

    public RepositoryBase(String tableName) {
        this.tableName = tableName;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/carolsboutique?useSSL=false";
        try {
            this.con = DriverManager.getConnection(url, "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean deleteById(int id) {
        if (con != null){
            try {
                ps = con.prepareStatement("DELETE FROM" + tableName + " WHERE id = " + id);
                rowsAffected = ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return rowsAffected==1;
    }

    @Override
    public boolean deleteById(String id) {
        if (con != null){
            try {
                ps = con.prepareStatement("DELETE FROM" + tableName + " WHERE id = " + id);
                rowsAffected = ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return rowsAffected==1;
    }

    @Override
    public List<IEntity> getWhere(String field, String value) {
        String statement = "SELECT * from" + tableName + " WHERE "+ field + " = " + value;
        return executeQuery(statement);
    }

    @Override
    public List<IEntity> getWhere(String field, int value) {
        String statement = "SELECT * from" + tableName + " WHERE "+ field + " = " + value;
        return executeQuery(statement);
    }

    @Override
    public List<IEntity> getAll() {
        String statement = "SELECT * FROM "+ tableName;
        return executeQuery(statement);
    }

    protected abstract List<IEntity> executeQuery(String statement);
}
