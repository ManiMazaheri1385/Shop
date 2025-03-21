package payment;

import java.util.ArrayList;

public abstract class Customer {
    public String name;
    public ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        paymentHistory = new ArrayList<String>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        paymentHistory.add(paymentStrategy.getPaymentDetails() + amount);
    }

    public void showPaymentHistory() {
        System.out.println(name + " payment history:");
        System.out.println();
        for (String history : paymentHistory) {
            System.out.println(history);
        }
    }
}
