import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regularCustomer1 = new RegularCustomer("SpongeBob");
        RegularCustomer regularCustomer2 = new RegularCustomer("Patrick");
        PremiumCustomer premiumCustomer = new PremiumCustomer("Squidward");

        CreditCardPayment creditCardPayment;
        PayPalPayment payPalPayment;
        BitcoinPayment bitcoinPayment;

        CreditCardPayment spongeBobCreditCardPayment = new CreditCardPayment("6037", regularCustomer1.name);
        PayPalPayment patrickPayPalPayment = new PayPalPayment(regularCustomer2.name + "@gmail.com");
        BitcoinPayment squidwardBitcoinPayment = new BitcoinPayment("Bikini Bottom Blue Moai Statue");

        System.out.println("========================================");
        regularCustomer1.displayCustomerInfo();
        System.out.println();
        regularCustomer2.displayCustomerInfo();
        System.out.println();
        premiumCustomer.displayCustomerInfo();
        System.out.println("========================================");

        System.out.println();

        System.out.println("****************************************");
        regularCustomer1.makePayment(spongeBobCreditCardPayment, 125.37);
        System.out.println();
        regularCustomer1.makePayment(spongeBobCreditCardPayment, 36.21);
        System.out.println("****************************************");
        regularCustomer2.makePayment(patrickPayPalPayment, 14.25);
        System.out.println();
        regularCustomer2.makePayment(patrickPayPalPayment, 5);
        System.out.println("****************************************");
        premiumCustomer.makePayment(squidwardBitcoinPayment, 1);
        System.out.println();
        premiumCustomer.makePayment(squidwardBitcoinPayment, 0.4);
        System.out.println("****************************************");

        System.out.println();

        System.out.println("----------------------------------------");
        regularCustomer1.showPaymentHistory();
        System.out.println("----------------------------------------");
        regularCustomer2.showPaymentHistory();
        System.out.println("----------------------------------------");
        premiumCustomer.showPaymentHistory();
        System.out.println("----------------------------------------");
    }
}
