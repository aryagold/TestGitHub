package Models;

public class Payment implements IEntity {
    public int Id;
    private PaymentEnum type;
    private String cardNumber;
    private boolean approved;

    public Payment(PaymentEnum type, String cardNumber, boolean approved) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.approved = approved;
    }

    public Payment() {
    }

    public PaymentEnum getType() {
        return type;
    }

    public void setType(PaymentEnum type) {
        this.type = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
