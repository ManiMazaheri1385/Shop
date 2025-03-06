package payment;

public class CreditCardPayment implements PaymentStrategy{
    public String cardNumber;
    public String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Credit card payment details:"
                + "\n   Card holder name: " + cardHolderName
                + "\n   Card number: " + cardNumber
                + "\n   Amount paid: " + "$";
    }
}
