
// Define PaymentMethod class that implements Entity interface, has a paymentMethodId, paymentMethodName fields, and a constructor.
// PaymentMethod nu are nici un camp in diagrama, am adaugat eu 2 care cred ca ar trebui sa fie (?)
public class PaymentMethod implements Entity {
    private int paymentMethodId;
    private String paymentMethodName;

    public PaymentMethod(int paymentMethodId, String paymentMethodName) {
        this.paymentMethodId = paymentMethodId;
        this.paymentMethodName = paymentMethodName;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    // define getId() method.
    @Override
    public int getId() {
        return entityId;
    }
}
