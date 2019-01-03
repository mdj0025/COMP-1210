 import org.junit.Assert;
 //import static org.junit.Assert.*;
 import org.junit.Before;
 import org.junit.Test;
 import java.io.FileNotFoundException;
 
 /** This method tests the UseTaxList method.
  *
  */
 public class UseTaxListTest {
 
 
    /** Fixture initialization (common initialization
     *  for all tests). **/
    @Before public void setUp() {
    }
 
 
    /** A test that always fails. 
    @Test public void defaultTest() {
       Assert.assertEquals("Default test added by jGRASP. Delete "
             + "this test once you have added your own.", 0, 1);
             
             
    */
    
    /** This method teste the readVehicleFile method.
     * @throws FileNotFoundException if the file is not found.
     */
    @Test public void readVehicleFileTest() throws FileNotFoundException {
    
       UseTaxList utl = new UseTaxList();
       utl.setTaxDistrict("Test District");
       Assert.assertEquals("Test District", utl.getTaxDistrict());
    }
    
    /** This method tests the getVehicle List method.
     * @throws FileNotFoundException if the file cannot be found.
     */
    @Test public void getVehicleListTest() throws FileNotFoundException
    {
       UseTaxList utl = new UseTaxList();
       VehiclesPart2 vPart2Obj = new VehiclesPart2();
       
       Vehicle.resetVehicleCount();
       String[] args = {"vehicles1.txt"};
       VehiclesPart2.main(args);
       Assert.assertEquals(0, utl.getVehicleList().length);
       Assert.assertEquals(0, utl.getExcludedRecords().length);
    }
    
    /** This method tests the toString method.
     * @throws FileNotFoundException throws the fila if not found.
     */
    @Test public void toStringTest() throws FileNotFoundException
    {
       UseTaxList utl = new UseTaxList();
       
       Assert.assertEquals(true, utl.toString().contains(" "));
       
       
    }
 }