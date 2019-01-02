import org.junit.Assert;
 //import static org.junit.Assert.*;
 import org.junit.Before;
 import org.junit.Test;
 /** This method tests the motorcycle class. */
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
    /** This method tests the getEngineSize method. */
    @Test public void getEngineSizeTest() {
       Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
          "1964 Harley-Davidson Sportster", 14000, false, 750);
       Assert.assertEquals(750, bike1.getEngineSize(), .000001);
    }
    /** This method tests the setEngineSize method. */
    @Test public void setEngineSizeTest() {
       Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
          "1964 Harley-Davidson Sportster", 14000, false, 750);
       bike1.setEngineSize(500);
       Assert.assertEquals(500, bike1.getEngineSize(), .000001);
    }
    
    /** This method tests the useTax method. */
    @Test public void useTax() {
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
    
    /** This method tests the toString method. */
    @Test public void toStringTest() {
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