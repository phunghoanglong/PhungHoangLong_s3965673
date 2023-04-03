package individualproject;

/**
 * @author <Phung Hoang Long - s3965673>
 */


 public abstract class GiftProduct extends Product {
    private String message;

    public GiftProduct(String name, String description, int quantityAvailable, double price, String message) {
        super(name, description, quantityAvailable, price);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract String getProductType();

    public String toString() {
        return getProductType() + " - " + getName();
    }
}