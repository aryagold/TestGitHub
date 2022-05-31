package Models;

public class User implements IEntity {
    private String userId;
    private String name;
    private String email;
    private String branchId;
    private String password;
    private RoleEnum role;

    public User(String userId, String name, String email, String branchId, String password, RoleEnum role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.branchId = branchId;
        this.password = password;
        this.role = role;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
}
