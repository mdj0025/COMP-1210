import org.junit.Assert;
 //import static org.junit.Assert.*;
 import org.junit.Before;
 import org.junit.Test;
 
 /** This is a test class for Car. */
 public class CarTest {
 
 
    /** Fixture initialization (common initialization
     *  for all tests). **/
    @Before public void setUp() {
    }
 
 
    /** A test that always fails. 
    @Test public void defaultTest() {
       Assert.assertEquals("Default test added by jGRASP. Delete "
             + "this test once you have added your own.", 0, 1);
    }
    */
    
    @Test public void getOwnerTest() {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       Assert.assertEquals("Jones, Sam", car1.getOwner());
       
    }
    
    /** This tests the setOwner method. */
    @Test public void setOwnerTest() {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       car1.setOwner("Doe, Jane");
       Assert.assertEquals("Doe, Jane", car1.getOwner());
       
    }
    /** This tests the getOwner method. */
    @Test public void getYearMakeModelTest() {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       Assert.assertEquals("2017 Honda Accord", car1.getYearMakeModel());
       
    }
    
    /** This tests the setYearMakeMode method. */
    @Test public void setYearMakeModelTest() {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       car1.setYearMakeModel("2017 Ferrari 458 Italia");
       Assert.assertEquals("2017 Ferrari 458 Italia", car1.getYearMakeModel());
       
    }
    /** This tests the getValue method. */
    @Test public void getValueTest() {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       Assert.assertEquals(22000, car1.getValue(), .000001);
       
    }
    
    /** This tests the setValue method. */
    @Test public void setValueTest()
    {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       car1.setValue(33000);
       Assert.assertEquals(33000, car1.getValue(), .000001);
    }
    
    /** This tests the getAlternativeFuel method. */
    @Test public void getAlternativeFuelTest()
    {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       Assert.assertEquals(false, car1.getAlternativeFuel());
    }
    
    /** This tests the setAlternativeFuel method. */
    @Test public void setAlternativeFuelTest()
    {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       car1.setAlternativeFuel(true);
       Assert.assertEquals(true, car1.getAlternativeFuel());
    }
    
    /** This tests the getVehicleCount method. */
    @Test public void getVehicleCountTest()
    {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       car1.resetVehicleCount();
       Assert.assertEquals(0, car1.getVehicleCount());
    }
    
    /** This tests the toString method. */
    @Test public void toStringTest()
    {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       
       Assert.assertEquals(true, car1.toString().contains("2017"));
       
       Car car2 = new Car("Jones, Joe", "2017 Honda Accord", 22000, true);
       Assert.assertEquals(true, car2.toString().contains("Honda"));
    }
    
    /** This tests the useTax method. */
    @Test public void useTaxTest()
    {
       Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
       Assert.assertEquals(220.0, car1.useTax(), .000001);
       
       Car car2 = new Car("Jones, Joe", "2017 Honda Accord", 22000, true);
       Assert.assertEquals(110.0, car2.useTax(), .000001);
       
       Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe", 
          110000, false);
       Assert.assertEquals(3300.0, car3.useTax(), .000001);
       
       Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe", 
          110000, true);
       Assert.assertEquals(2750.0, car4.useTax(), .000001);
    }
    
    /** This tests the toString method. */
    @Test public void toStringTest2()
    {
       Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe", 
          110000, false);
       Assert.assertEquals(true, car3.toString().contains("Luxury"));
       
       Car car2 = new Car("Jones, Joe", "2017 Honda Accord", 22000, true);
       Assert.assertEquals(false, car2.toString().contains("Luxury"));
       
       Car car6 = new Car("Jones, Joe", "2017 Honda Accord", 100000, true);
       Assert.assertEquals(true, car6.toString().contains("Luxury"));
       
    }
   
 }