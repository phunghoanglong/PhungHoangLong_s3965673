package individualproject;

/**
 * @author <Phung Hoang Long - s3965673>
 */

 public class PhysicalGiftProduct extends PhysicalProduct {
    private String message;

    public PhysicalGiftProduct(String name, String description, int quantityAvailable, double price, String message, double weight) {
        super(name, description, quantityAvailable, price, weight);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProductType() {
        return "PHYSICAL_GIFT";
    }

    public String toString() {
        return getProductType() + " - " + getName();
    }
}