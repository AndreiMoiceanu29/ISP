// Define Card class that extends PaymentMethod class, has a cardNumber, cardExpirationDate, cardCvv, cardHolderName, and constructors.
public class Card extends PaymentMethod {
    private String cardNumber;
    private String cardExpirationDate;
    private String cardCvv;
    private String cardHolderName;

    public Card(int paymentMethodId, String paymentMethodName, String cardNumber, String cardExpirationDate,
            String cardCvv,
            String cardHolderName) {
        super(paymentMethodId, paymentMethodName);
        this.cardNumber = cardNumber;
        this.cardExpirationDate = cardExpirationDate;
        this.cardCvv = cardCvv;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public String getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }
}
