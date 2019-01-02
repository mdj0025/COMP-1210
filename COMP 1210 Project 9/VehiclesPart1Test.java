import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This program implements test cases for VehiclesPart1.
 *
 * Project 09
 * Michael Johnson Comp1210 Section 003
 * 11-16-17
 */
public class VehiclesPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. 
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
            
   */
   
   /** This method tests elements in the main method. */
   @Test public void vehiclesPart1Test() 
   {
      VehiclesPart1 vp1 = new VehiclesPart1();
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null);
      Assert.assertEquals("Vehicle.vehicleCount should be 8.", 
         8, Vehicle.getVehicleCount());
      
   }
   
}

