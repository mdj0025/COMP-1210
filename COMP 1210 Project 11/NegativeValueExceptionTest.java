import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** This class tests the NegativeValueException method.
 *
 * Project 11
 * Michael Johnson Comp1210 Section 003
 * 12-08-17
 */
public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

    /** This method tests to make sure a negative value is thrown.
     *
     */
   @Test public void defaultTest() {
      boolean thrown = false;
      try 
      {
         Car car = new 
            Car("Jackson, Bo", "2012 Toyota Camry", -25000, false);   
      }
      catch (NegativeValueException e)
      {
         thrown = true;
      }
      Assert.assertTrue(
         "Expected NegativeValueException to be thrown.", thrown);
         
   }
}
