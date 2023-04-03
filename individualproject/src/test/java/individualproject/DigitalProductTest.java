package individualproject;

/**
 * @author <Phung Hoang Long - s3965673>
 */

 import org.junit.jupiter.api.Test;

 import static org.junit.jupiter.api.Assertions.assertEquals;
 
 public class DigitalProductTest {
 
     @Test
     public void testToString() {
         DigitalProduct digitalProduct = new DigitalProduct("Product1", "Description1", 10, 9.99);
         assertEquals("DIGITAL - Product1", digitalProduct.toString());
     }
 
 }