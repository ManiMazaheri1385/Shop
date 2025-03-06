package payment;

public class PayPalPayment implements PaymentStrategy{
    public String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails() + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal payment details:"
                + "\n   Email: " + email
                + "\n   Amount paid: "+ "$";
    }
}
