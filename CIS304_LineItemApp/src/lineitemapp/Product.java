package lineitemapp;

/**
 * Created by bryanshintani on 2/6/17.
 */
public class Product {
    private String sku;
    private String description;
    private double price;

    public Product(String sku, String description, double price) {
        this.sku = sku;
        this.description = description;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
