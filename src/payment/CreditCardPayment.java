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
        System.out.println(getPaymentDetails());
        System.out.println("Amount paid: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Credit card payment details:"
                + "\nCard holder name: " + cardHolderName
                + "\nCard number: " + cardNumber;
    }
}
