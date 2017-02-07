package lineitemapp;

/**
 * Created by bryanshintani on 2/6/17.
 */
public class LineItem {

    private int qty;
    private Product anItem;

    public LineItem(int qty, Product anItem) {
        this.qty = qty;
        this.anItem = anItem;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getAnItem() {
        return anItem;
    }

    public void setAnItem(Product anItem) {
        this.anItem = anItem;
    }
}
