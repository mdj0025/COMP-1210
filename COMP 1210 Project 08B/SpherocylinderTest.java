import org.junit.Assert;
 //import static org.junit.Assert.*;
 import org.junit.Before;
 import org.junit.Test;
 
 
 /** This is a test class for the Spherocylinder object.
  *
  * Project 08B
  * Michael Johnson Comp1210 Section 003
  * 11-10-17
  */
 public class SpherocylinderTest {
 
 
    /** Fixture initialization (common initialization
     *  for all tests). **/
    @Before public void setUp() 
    {
    }
 
    /** This method tests the getLabel method.
     */
    @Test public void getLabelTest() 
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals("Test Example", sphero.getLabel());     
    }
    
    /** This method tests the setLabel method.
     */
    @Test public void setLabelFalseTest()
    {
       Spherocylinder sphero = new Spherocylinder(null, 0.0, 0.0);
       Assert.assertEquals(false, sphero.setLabel(null));
    }
    
    /** This method tests the setLabel method.
     */
    @Test public void setLabelTrueTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(true, sphero.setLabel("Test Example"));
    }
    
    /** This method tests the getRadius method.
     */
    @Test public void getRadiusTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(16.0, sphero.getRadius(), .000001);
    }
    
    /** This method tests the setRaduis method and makes sure it fails.
     */
    @Test public void setRadiusFalseTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", -2, 22.0);
       Assert.assertEquals(false, sphero.setRadius(-2));
    }
    
    /** This method tests the setRadius method.
     */
    @Test public void setRadiusTrueTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(true, sphero.setRadius(2));
    } 
    
    /** This method tests the getCylinderHeight method.
     */
    @Test public void getCylinderHeightTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(22.0, sphero.getCylinderHeight(), .000001);
    }
    
    /** This method tests the setCylinderHeight method and make sure it fails.
     */
    @Test public void setCylinderHeightFalseTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, -22.0);
       Assert.assertEquals(false, sphero.setCylinderHeight(-22.0));
    }
    
    /** This method tests the circumference method.
     */
    @Test public void circumferenceTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(100.530964, sphero.circumference(), .000001);
    }
    
    /** This method tests the surfaceArea method.
     */
    @Test public void surfaceAreaTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(5428.672105, sphero.surfaceArea(), .000001);
    }
    
    /** This method tests the volume method.
     */
    @Test public void volumeTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(34850.734503, sphero.volume(), .000001);
    }
    
    /** This method tests the toString method.
     */
    @Test public void toStringTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals("Spherocylinder \"Test Example\" with radius 16.0 and"
          + " cylinder height 22.0 has:\n\tcircumference = 100.531"
          + " units\n\tsurface"
          + " area = 5,428.672 square units\n\tvolume = 34,850.735 cubic units",
          sphero.toString());
    }
    
    /** This method tests the getCount method.
     */
    @Test public void getCountTest()
    {
       
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       sphero.resetCount();
       Assert.assertEquals(0, sphero.getCount());  
    }
    
    /** This method tests the resetCount method.
     */
    @Test public void resetCountTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Spherocylinder sphero12 = new Spherocylinder("Test Example", 165.0,
           2255.0);
       sphero.resetCount();
       Assert.assertEquals(0, sphero.getCount());
    
    }
    
    /** This method tests the equals method and makes sure it fails.
     */
    @Test public void equalsFalseTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Spherocylinder sphero12 = new Spherocylinder("Tet Example", 16.0, 22.0);
       Assert.assertEquals(false, sphero.equals(sphero12));
       
       Spherocylinder sphero13 = new Spherocylinder("Test Example", 12.0, 22.0);
       Assert.assertEquals(false, sphero.equals(sphero13));
       
       Spherocylinder sphero14 = new Spherocylinder("Test Example", 16.0, 2.0);
       Assert.assertEquals(false, sphero.equals(sphero14));
       
       Assert.assertEquals(false, sphero.equals("not an object"));
       
         
    }
    
    /** This method tests the equals method.
     */
    @Test public void equalsTrueTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Spherocylinder sphero34 = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(true, sphero.equals(sphero34));
    }
    
    /** This method tests the hashCode method.
     */
    @Test public void hashCodeTest()
    {
       Spherocylinder sphero = new Spherocylinder("Test Example", 16.0, 22.0);
       Assert.assertEquals(0, sphero.hashCode());
    }
 }