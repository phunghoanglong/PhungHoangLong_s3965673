package individualproject;

/**
 * @author <Phung Hoang Long - s3965673>
 */


 public class DigitalGiftProduct extends DigitalProduct {
    private String message;

    public DigitalGiftProduct(String name, String description, int quantity, double price, String message) {
        super(name, description, quantity, price);
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return "Digital Gift";
    }

    public String getGiftMessage() {
        return message;
    }

    public String getDownloadLink() {
        return "Download Link";
    }

    @Override
    public String toString() {
        return "DIGITAL GIFT - " + getName();
    }
}
