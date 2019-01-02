import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This method tests the Truck class. 
 *
 * Project 11
 * Michael Johnson Comp1210 Section 003
 * 12-08-17
 */
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
   /** This method tests the getTons method. 
    * @throws NegativeValueException -- if the value is negative.
    */
   @Test public void getTonsTest() throws NegativeValueException {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, false, 1.5);
      Assert.assertEquals(1.5, truck1.getTons(), .000001);
   }
   
   /** This method tests the setTons method. 
    * @throws NegativeValueException -- if the value is negative.
    */
   @Test public void setTonsTest() throws NegativeValueException {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, false, 1.5);
      truck1.setTons(3.0);
      Assert.assertEquals(3.0, truck1.getTons(), .000001);
   }
   
   /** This method tests the useTax method. 
    * @throws NegativeValueException -- if the value is negative.
    */
   @Test public void useTaxTest() throws NegativeValueException {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
         30000, false, 1.5);
      Assert.assertEquals(600.0, truck1.useTax(), .000001);
      
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
         40000, true, 2.5);
      Assert.assertEquals(1600, truck2.useTax(), .000001);
   }
   
   /** This method tests the toString method. 
    * @throws NegativeValueException -- if the value is negative.
    */
   @Test public void toStringTest() throws NegativeValueException {
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
