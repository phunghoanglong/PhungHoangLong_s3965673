package individualproject;
/**
 * @author <Phung Hoang Long - s3965673>
 */

 public abstract class Product {
    private String name;
    private String description;
    private int quantityAvailable;
    private double price;

    public Product(String name, String description, int quantityAvailable, double price) {
        this.name = name;
        this.description = description;
        this.quantityAvailable = quantityAvailable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public abstract String getProductType();

    public abstract String toString();
}