package Models;

import java.sql.Timestamp;

public class InventoryControl implements IEntity {
    public int Id;
    private String employeeId;
    private String productId;
    private Timestamp date;
    private int quantityBefore;
    private int newStockQuantity;
    private boolean posted;

    public InventoryControl(String employeeId, String productId, Timestamp date, int quantityBefore, int newStockQuantity, boolean posted) {
        this.employeeId = employeeId;
        this.productId = productId;
        this.date = date;
        this.quantityBefore = quantityBefore;
        this.newStockQuantity = newStockQuantity;
        this.posted = posted;
    }

    public InventoryControl() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getQuantityBefore() {
        return quantityBefore;
    }

    public void setQuantityBefore(int quantityBefore) {
        this.quantityBefore = quantityBefore;
    }

    public int getNewStockQuantity() {
        return newStockQuantity;
    }

    public void setNewStockQuantity(int newStockQuantity) {
        this.newStockQuantity = newStockQuantity;
    }

    public boolean isPosted() {
        return posted;
    }

    public void setPosted(boolean posted) {
        this.posted = posted;
    }
}
