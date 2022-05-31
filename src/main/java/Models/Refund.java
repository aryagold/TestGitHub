package Models;

import java.sql.Timestamp;

public class Refund implements IEntity {
    public int Id;
    private String saleId;
    private Timestamp date;

    public Refund(String saleId, Timestamp date) {
        this.saleId = saleId;
        this.date = date;
    }

    public Refund() {
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
