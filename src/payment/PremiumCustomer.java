package payment;

public class PremiumCustomer extends Customer {

    public PremiumCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer Information:"
                + "\n   Customer type: Premium"
                + "\n   Customer name: " + name);
    }
}
