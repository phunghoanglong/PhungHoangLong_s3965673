package individualproject;

/**
 * @author <Phung Hoang Long - s3965673>
 */
 
 public class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(String name, String description, int quantityAvailable, double price, double weight) {
        super(name, description, quantityAvailable, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProductType() {
        return "PHYSICAL";
    }

    public String toString() {
        return getProductType() + " - " + getName();
    }
}