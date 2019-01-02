import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** This class tests the VehiclesPart3 class.
 *
 * Project 11
 *
 * Michael Johnson Comp1210 Section 003
 * 11-08-17
 */
public class VehiclesPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** This method tests to make sure the proper number
    * of objects are being added from the file.
    *
    */
   @Test public void countTest() 
   {
      VehiclesPart3 vehicleObj = new VehiclesPart3();
      
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles2.txt"};
      vehicleObj.main(args);
      Assert.assertEquals(9, Vehicle.getVehicleCount());
   } 
   
   /** This method tests with a file that doesnt exist.
    * 
    */
   @Test public void countFailTest() 
   {
      VehiclesPart3 vehicleObj = new VehiclesPart3();
      
      Vehicle.resetVehicleCount();
      String[] args = {"veh.txt"};
      vehicleObj.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
   }
   
   /** This method tests with no file being read in.
    *
    */
   @Test public void noCountTest() 
   {
      VehiclesPart3 vehicleObj = new VehiclesPart3();
      
      Vehicle.resetVehicleCount();
      String[] args = {};
      vehicleObj.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
   }
   
   
     
}
