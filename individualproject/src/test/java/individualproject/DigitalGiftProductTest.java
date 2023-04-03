package individualproject;


/**
 * @author <Phung Hoang Long - s3965673>
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DigitalGiftProductTest {
    private DigitalGiftProduct digitalGiftProduct;
    
    @BeforeEach
    public void setup() {
        digitalGiftProduct = new DigitalGiftProduct("Product4", "Description4", 15, 39.99, "Gift Message");

    }
    
    @Test
    public void testGetType() {
        assertEquals("Digital Gift", digitalGiftProduct.getType());
    }
    
    @Test
    public void testGetGiftMessage() {
        assertEquals("Gift Message", digitalGiftProduct.getGiftMessage());
    }
    
    @Test
    public void testGetDownloadLink() {
        assertEquals("Download Link", digitalGiftProduct.getDownloadLink());
    }
}