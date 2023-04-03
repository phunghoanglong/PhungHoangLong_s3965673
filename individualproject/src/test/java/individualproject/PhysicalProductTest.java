package individualproject;



/**
 * @author <Phung Hoang Long - s3965673>
 */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhysicalProductTest {

    @Test
    public void testToString() {
        PhysicalProduct physicalProduct = new PhysicalProduct("Product2", "Description2", 5, 19.99, 2.5);
        assertEquals("PHYSICAL - Product2", physicalProduct.toString());
    }

    @Test
    public void testSetAndGetWeight() {
        PhysicalProduct physicalProduct = new PhysicalProduct("Product2", "Description2", 5, 19.99, 2.5);
        assertEquals(2.5, physicalProduct.getWeight(), 0.001);
        physicalProduct.setWeight(3.0);
        assertEquals(3.0, physicalProduct.getWeight(), 0.001);
    }

}
