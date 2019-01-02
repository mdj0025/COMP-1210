import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This method tests the motorcycle class. 
 *
 * Project 11
 * Michael Johnson Comp1210 Section 003
 * 12-08-17
 */
public class MotorcycleTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails.
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
            
   */
   /** This method tests the getEngineSize method. 
    * @throws NegativeValueException -- if the value is negative.
    */
   @Test public void getEngineSizeTest() throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      Assert.assertEquals(750, bike1.getEngineSize(), .000001);
   }
   /** This method tests the setEngineSize method. 
    * @throws NegativeValueException -- if the value is negative.
    */
   @Test public void setEngineSizeTest() throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      bike1.setEngineSize(500);
      Assert.assertEquals(500, bike1.getEngineSize(), .000001);
   }
   
   /** This method tests the useTax method. 
    * @throws NegativeValueException -- if the value is negative.
    */
   @Test public void useTax() throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      Assert.assertEquals(280.0, bike1.useTax(), .000001);
      
      Motorcycle bike2 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, true, 750);
      Assert.assertEquals(245.0, bike2.useTax(), .000001);
      
      Motorcycle bike3 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 100);
      Assert.assertEquals(70.0, bike3.useTax(), .000001);
      
   }
   
   /** This method tests the toString method. 
    * @throws NegativeValueException -- if the value is negative.
    */
   @Test public void toStringTest() throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      Assert.assertEquals(true, bike1.toString().contains("Large Bike"));
      
      Motorcycle bike3 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, false, 100);
      Assert.assertEquals(false, bike3.toString().contains("Large Bike"));
      
      Motorcycle bike2 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, true, 100);
      Assert.assertEquals(false, bike2.toString().contains("Large Bike"));
      
      Motorcycle bike4 = new Motorcycle("Brando, Marlon", 
         "1964 Harley-Davidson Sportster", 14000, true, 750);
      Assert.assertEquals(true, bike4.toString().contains("Large Bike"));
   }
   
}
