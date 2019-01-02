import org.junit.Assert;
 //import static org.junit.Assert.*;
 import org.junit.Before;
 import org.junit.Test;
 
 /** This method tests the semiTractorTrailer class. */
 public class SemiTractorTrailerTest {
 
 
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
    /** This tests the getAxles method. */
    @Test public void getAxlesTest() {
       SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
          "2012 International Big Boy", 45000, false, 5.0, 4);
       Assert.assertEquals(4, semi1.getAxles());
    }
    
    /** This tests the setAxles method. */
    @Test public void setAxlesTest() {
       SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
          "2012 International Big Boy", 45000, false, 5.0, 4);
       semi1.setAxles(6);
       Assert.assertEquals(6, semi1.getAxles());
    }
    
    /** This tests the useTax method. */
    @Test public void useTaxTest() {
       SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
          "2012 International Big Boy", 45000, false, 5.0, 4);
       Assert.assertEquals(3150.0, semi1.useTax(), .000001);
    }
    
    /** This tests the toString method. */
    @Test public void toStringTest() {
       SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
          "2012 International Big Boy", 45000, false, 5.0, 4);
       Assert.assertEquals(true, semi1.toString().contains("Axle"));
      
       SemiTractorTrailer semi2 = new SemiTractorTrailer("Williams, Pat", 
          "2012 International Big Boy", 45000, false, 1.0, 1);
       Assert.assertEquals(false, semi2.toString().contains("Axle"));
    }
    
 }