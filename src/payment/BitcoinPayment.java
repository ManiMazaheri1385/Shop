package payment;

public class BitcoinPayment implements PaymentStrategy{
    public String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(getPaymentDetails());
        System.out.println("Amount paid: " + amount);
    }

    @Override
    public String getPaymentDetails() {
        return "Bitcoin payment details:"
                + "\nWallet address: " + walletAddress;
    }
}
