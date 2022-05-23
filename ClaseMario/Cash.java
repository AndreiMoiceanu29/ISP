// Define Cash class that extends PaymentMethod class, has a shippindAddress and constructors.
public class Cash extends PaymentMethod {
    private String shippingAddress;

    public Cash(int paymentMethodId, String paymentMethodName, String shippingAddress) {
        super(paymentMethodId, paymentMethodName);
        this.shippingAddress = shippingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
