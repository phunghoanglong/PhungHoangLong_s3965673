package individualproject;


/**
 * @author <Phung Hoang Long - s3965673>
 */

 import org.junit.Test;
 import static org.junit.Assert.*;
 
 public class GiftProductTest {
 
     @Test
     public void testSetAndGetMessage() {
         PhysicalGiftProduct physicalGiftProduct = new PhysicalGiftProduct("Product1", "Description1", 10, 9.99, "Happy Birthday!", 1.5);
         String expectedMessage = "Gift Message";
         physicalGiftProduct.setMessage(expectedMessage);
         String actualMessage = physicalGiftProduct.getMessage();
         assertEquals(expectedMessage, actualMessage);
     }
 
   
     
 
     @Test
     public void testMessageIsEmpty() {
         PhysicalGiftProduct physicalGiftProduct =  new PhysicalGiftProduct("Product1", "Description1", 10, 9.99, "Happy Birthday!", 1.5);
         String expectedMessage = "";
         physicalGiftProduct.setMessage(expectedMessage);
         String actualMessage = physicalGiftProduct.getMessage();
         assertEquals(expectedMessage, actualMessage);
     }
 
     @Test
     public void testMessageIsWhitespace() {
         PhysicalGiftProduct physicalGiftProduct =  new PhysicalGiftProduct("Product1", "Description1", 10, 9.99, "Happy Birthday!", 1.5);
         String expectedMessage = "  \t   ";
         physicalGiftProduct.setMessage(expectedMessage);
         String actualMessage = physicalGiftProduct.getMessage();
         assertEquals(expectedMessage, actualMessage);
     }
 
     @Test
     public void testSetAndGetMessageForDigitalProduct() {
         DigitalGiftProduct digitalGiftProduct = new DigitalGiftProduct("Product1", "Description1", 10, 9.99, "https://example.com");
         String expectedMessage = "Gift Message";
         digitalGiftProduct.setMessage(expectedMessage);
         String actualMessage = digitalGiftProduct.getMessage();
         assertEquals(expectedMessage, actualMessage);
     }
 
     @Test
     public void testMessageIsEmptyForDigitalProduct() {
         DigitalGiftProduct digitalGiftProduct = new DigitalGiftProduct("Product1", "Description1", 10, 9.99, "https://example.com");
         String expectedMessage = "";
         digitalGiftProduct.setMessage(expectedMessage);
         String actualMessage = digitalGiftProduct.getMessage();
         assertEquals(expectedMessage, actualMessage);
     }
 
     @Test
     public void testMessageIsWhitespaceForDigitalProduct() {
         DigitalGiftProduct digitalGiftProduct = new DigitalGiftProduct("Product1", "Description1", 10, 9.99, "https://example.com");
         String expectedMessage = "  \t   ";
         digitalGiftProduct.setMessage(expectedMessage);
         String actualMessage = digitalGiftProduct.getMessage();
         assertEquals(expectedMessage, actualMessage);
     }
 }
 