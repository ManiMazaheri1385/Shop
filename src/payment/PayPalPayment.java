package payment;

public class PayPalPayment implements PaymentStrategy{
    public String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails());
        System.out.println("Amount paid: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal payment details:"
                + "\nEmail: " + email;
    }
}
