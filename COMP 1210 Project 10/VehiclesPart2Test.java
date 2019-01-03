import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/** This method tests the VehiclesPart2 class.
 *
 */
public class VehiclesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**  This method tests the vehiclesPart2 class.
    * @throws FileNotFoundException if the file cannot be found.
    */
   @Test public void vehiclesPart2Test() throws FileNotFoundException {
      VehiclesPart2 vPart2Obj = new VehiclesPart2();
      
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles1.txt"};
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   }
}
