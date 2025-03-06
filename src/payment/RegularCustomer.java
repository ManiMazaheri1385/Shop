package payment;

public class RegularCustomer extends Customer {

    public RegularCustomer(String name) {
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Customer Information:"
                + "\n   Customer type: Regular"
                + "\n   Customer name: " + name);
    }
}
