package individualproject;

/**
 * @author <Phung Hoang Long - s3965673>
 */

 import org.junit.jupiter.api.Test;

 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.junit.jupiter.api.Assertions.assertNotEquals;
 
 public class ProductTest {
 
     @Test
     public void testToStringDigitalProduct() {
         DigitalProduct digitalProduct = new DigitalProduct("Product1", "Description1", 10, 9.99);
         assertEquals("DIGITAL - Product1", digitalProduct.toString());
     }
 
     @Test
     public void testToStringPhysicalProduct() {
         PhysicalProduct physicalProduct = new PhysicalProduct("Product2", "Description2", 5, 19.99, 2.5);
         assertEquals("PHYSICAL - Product2", physicalProduct.toString());
     }
 
     @Test
     public void testEqualsAndHashcodeDigitalProduct() {
         DigitalProduct product1 = new DigitalProduct("Product1", "Description1", 10, 9.99);
         DigitalProduct product2 = new DigitalProduct("Product1", "Description1", 10, 9.99);
         DigitalProduct product3 = new DigitalProduct("Product3", "Description3", 5, 19.99);
         assertEquals(product1.toString(), product2.toString());
         assertNotEquals(product1, product3);
         
       
     }
 
     @Test
     public void testEqualsAndHashcodePhysicalProduct() {
         PhysicalProduct product1 = new PhysicalProduct("Product1", "Description1", 10, 9.99, 2.5);
         PhysicalProduct product2 = new PhysicalProduct("Product1", "Description1", 10, 9.99, 2.5);
         PhysicalProduct product3 = new PhysicalProduct("Product3", "Description3", 5, 19.99, 1.0);
         assertEquals(product1.toString(), product2.toString());
         assertNotEquals(product1, product3);
       
     }
 
 }