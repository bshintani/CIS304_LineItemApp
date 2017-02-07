package lineitemapp;

/**
 * Created by bryanshintani on 2/6/17.
 */

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer aCustomer;
    private Clerk aClerk;
    private ArrayList<LineItem> lineItemList;
    private final double TAX_RATE = 0.0725;

    public Order(Customer aCustomer, Clerk aClerk) {
        this.aCustomer = aCustomer;
        this.aClerk = aClerk;
    }

    public void addItem(LineItem anItem) {

        lineItemList.add(anItem);
    }

    public void removeItem(LineItem anItem) {

        lineItemList.remove(anItem);
    }

    public double getSubtotal() {
        double subtotal = 0;

        for (LineItem anItem : lineItemList) {

            subtotal += anItem.getQty() * anItem.getAnItem().getPrice();
        }

        return subtotal;
    }

    public double getTax() {
        double tax = getSubtotal() * TAX_RATE;

        return tax;
    }

    public double getTotal() {
        double total = getTax() + getTotal();

        return total;
    }

    public String getSummary() {

        String summary = "Order Summary\n\n";

        summary += "Order processed by Clerk\n";
        summary += "Name: " + aClerk.getFirstName() + ", " + aClerk.getLastName() + "\n\n";
        summary += "Order Customer\n";
        summary += "Name: " + aCustomer.getFirstName() + ", " + aCustomer.getLastName() + "\n\n";
        summary += "Order Items\n";

        for (LineItem anItem : lineItemList) {
            summary += anItem.getQty() + "\t" +
                    anItem.getAnItem().getSku() + "\t" +
                    anItem.getAnItem().getDescription() + "\t" +
                    anItem.getAnItem().getPrice() + "\n";
        }

        return summary;
    }
}
