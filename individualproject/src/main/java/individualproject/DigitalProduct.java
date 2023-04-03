package individualproject;


/**
 * @author <Phung Hoang Long - s3965673>
 */
public class DigitalProduct extends Product {

    private String giftMessage;

    public DigitalProduct(String name, String description, int quantityAvailable, double price) {
        super(name, description, quantityAvailable, price);
    }

    public String getProductType() {
        return "DIGITAL";
    }

    public String toString() {
        return getProductType() + " - " + getName();
    }

    public String getMessage() {
        return giftMessage;
    }

    public void setMessage(String message) {
        giftMessage = message;
    }
    
}