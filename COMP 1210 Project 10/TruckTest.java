 import org.junit.Assert;
 //import static org.junit.Assert.*;
 import org.junit.Before;
 import org.junit.Test;
 
 /** This test class tests the Truck class. */
 public class TruckTest {
 
 
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
    /** This method tests the getTons method. */
    @Test public void getTonsTest() {
       Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
          30000, false, 1.5);
       Assert.assertEquals(1.5, truck1.getTons(), .000001);
    }
    
    /** This method tests the setTons method. */
    @Test public void setTonsTest() {
       Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
          30000, false, 1.5);
       truck1.setTons(3.0);
       Assert.assertEquals(3.0, truck1.getTons(), .000001);
    }
    
    /** This method tests the useTax method. */
    @Test public void useTaxTest() {
       Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
          30000, false, 1.5);
       Assert.assertEquals(600.0, truck1.useTax(), .000001);
       
       Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
          40000, true, 2.5);
       Assert.assertEquals(1600, truck2.useTax(), .000001);
    }
    
    /** This method tests the toString method. */
    @Test public void toStringTest() {
       Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
          40000, true, 2.5);
       Assert.assertEquals(true, truck2.toString().contains("Large"));
       
       Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
          30000, false, 1.5);
       Assert.assertEquals(false, truck1.toString().contains("Large"));
       
       Truck truck3 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
          30000, true, 1.5);
       Assert.assertEquals(true, truck3.toString().contains("0.01"));
       
       
    }
 }