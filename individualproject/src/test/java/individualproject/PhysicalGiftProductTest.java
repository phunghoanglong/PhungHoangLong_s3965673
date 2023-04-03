package individualproject;

/**
 * @author <Phung Hoang Long - s3965673>
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhysicalGiftProductTest {

    private PhysicalGiftProduct physicalGiftProduct;

    @BeforeEach
    public void setup() {
        physicalGiftProduct = new PhysicalGiftProduct("Product1", "Description1", 10, 9.99, "Gift Message", 2.5);
    }

    @Test
    public void testGetWeight() {
        assertEquals(2.5, physicalGiftProduct.getWeight());
    }

    @Test
    public void testSetWeight() {
        physicalGiftProduct.setWeight(3.5);
        assertEquals(3.5, physicalGiftProduct.getWeight());
    }

    @Test
    public void testGetMessage() {
        assertEquals("Gift Message", physicalGiftProduct.getMessage());
    }

    @Test
    public void testSetMessage() {
        physicalGiftProduct.setMessage("New Gift Message");
        assertEquals("New Gift Message", physicalGiftProduct.getMessage());
    }

    @Test
    public void testToString() {
        assertEquals("PHYSICAL_GIFT - Product1", physicalGiftProduct.toString());
    }
}
