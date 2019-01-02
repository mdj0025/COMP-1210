import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * This class contains tests for the project.
 *
 * Project 08B
 * Michael Johnson Comp1210 Section 003
 * 11-10-17
 */


public class SpherocylinderList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. 
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
            
   */
   
   /** This tests the getName method.
    */
   @Test public void getNameTest()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals("Test List", sList.getName()); 
   }
   
   /** This method tests the numberOfSpherocylinders method.
    */
   @Test public void numberOfSpherocylindersTest()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(3, sList.numberOfSpherocylinders());
   }
   
   /** This method tests the totalSurfaceArea method.
    */
   @Test public void totalSurfaceAreaTest()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(73626.365429, sList.totalSurfaceArea(), .000001); 
   }
   
   /** This method tests the totalVolume method.
    */
   @Test public void totalVolumeTest()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
   
      Assert.assertEquals(1517485.593858, sList.totalVolume(), .000001);
   }
   
   /** This method tests the averageSurfaceArea method.
    */
   @Test public void averageSurfaceAreaTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(24542.121809, sList.averageSurfaceArea(), .000001);
   }
   
   /** This method tests the averageSurfaceArea method 
    *  and makes sure it returns 0.
    */
   @Test public void averageSurfaceAreaTest2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals(0, sList.averageSurfaceArea(), .000001);
   }
   
   /** This method tests the averageVolume method.
    */
   @Test public void averageVolumeTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(505828.531286, sList.averageVolume(), .000001);
   }
   
   /** This method tests the averageVolume method and makes sure it returns 0.
    */
   @Test public void averageVolumeTest2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals(0, sList.averageVolume(), .000001);
   }
   
   /** This method tests the toString method.
    */
   @Test public void toStringTest()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 1);
      
      Assert.assertEquals("Test List\n\nSpherocylinder \"Small Example\""
         + " with radius 2.0 and cylinder height 5.0 has:"
         + "\n\tcircumference = 12.566 units\n\tsurface"
         + " area = 113.097 square units\n\tvolume = 96.342 cubic units\n",
          sList.toString());
   }
   
   /** This method tests the summaryInfo method 
    *  and makes sure it returns an empty list.
    */
   @Test public void summaryInfoTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals("----- Summary for Spherocylinder Empty Test List"
         + " -----\nNumber of Spherocylinders: 0\nTotal Surface Area:"
         + " 0.0\nTotal Volume: 0.0\nAverage Surface Area:"
         + " 0.0\nAverage Volume: 0.0", sList.summaryInfo());
   }
   
   /** This method tests the summaryInfo method.
    */
   @Test public void summaryInfoTest2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 1);
      
      Assert.assertEquals("----- Summary for Spherocylinder Test List -----"
         + "\nNumber of Spherocylinders: 1\nTotal Surface Area:" 
         + " 113.097\nTotal Volume: "
         + "96.342\nAverage Surface Area: 113.097\nAverage Volume: 96.342",
             sList.summaryInfo());
   }
   
   /** This method tests the getList method.
    */
   @Test public void getListTest()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
   }
   
   /** This method tests the readFile method.
    * @throws FileNotFoundException -- throws file if not found.
    */
   @Test public void readFileTest() throws FileNotFoundException
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      sList = sList.readFile("spherocylinder_data_0.txt");
      
      Assert.assertEquals("Spherocylinder Empty Test List", sList.getName());
      
      sList = sList.readFile("spherocylinder_data_1.txt");
      Assert.assertEquals("Spherocylinder Test List", sList.getName());
      
      
   }
   
   /** This method tests the addSpherocylinder method.
    */
   @Test public void addSpherocylinderTest()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Spherocylinder sphero1 = new Spherocylinder("Test Example", 4.0, 12.0);
      sList.addSpherocylinder("Test Example", 4.0, 12.0);
      Spherocylinder[] test = sList.getList();
      
      Assert.assertEquals(sphero1, test[3]); 
   }
   
   /** This method tests the findSpherocylinder method.
    */
   @Test public void findSpherocylinderTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Spherocylinder sphero1 = new Spherocylinder("Large Example", 
         50.0, 125.0);
      Spherocylinder[] test = sList.getList();
      
      Assert.assertEquals(sphero1, 
         sList.findSpherocylinder("Large Example"));
   }
   
   /** This method tests the findSpherocylinder method 
    *  and makes sure it returns null.
    */
   @Test public void findSpherocylinderTest2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals(null, sList.findSpherocylinder("Large Example"));
   }
   
   /** This method tests the deleteSpherocylinder method 
    *  and makes sure it returns null.
    */
   @Test public void deleteSpherocylinderTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      sList.deleteSpherocylinder("Large Example");
      
      Assert.assertEquals(sArray[2], null);
      
      
   }
   
   /** This method tests the deleteSpherocylinder method 
    *  and makes sure it dosen't find it.
    */
   @Test public void deleteSpherocylinder2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals(null, sList.deleteSpherocylinder("Large Example"));
      
      
   }
   
   /** This method tests the deleteSpherocylinder method 
    *  and makes sure it adjusts the array.
    */
   @Test public void deleteSpherocylinderTest3()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      Spherocylinder spheroCyl = new Spherocylinder("Medium Example", 
         10.0, 25.0);
      
      Spherocylinder[] sphero2 = sList.getList();
      Assert.assertEquals(spheroCyl, sphero2[1]);
      
      sList.deleteSpherocylinder("Small Example");
      Assert.assertEquals(spheroCyl, sphero2[0]);
      
             
   }
   
   /** This method tests the editSpherocylinder method.
    */
   @Test public void editSpherocylinderTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(true, sList.editSpherocylinder("Small Example", 
         3.0, 6.0));
      
      Assert.assertEquals(false, sList.editSpherocylinder("Not Found", 
         33.0, 678.0));
   }
   
   /** This method tests the findSpherocylinderwithShortestRadius method.
    */
   @Test public void findSpherocylinderWithShortestRadiusTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(sList.findSpherocylinderWithShortestRadius(), 
         sArray[0]);
   }
   
   /** This method tests the findSpherocylinderwithShortestRadius method
    *  and it makes sure it returns null when there isn't anything in the array.
    */
   @Test public void findSpherocylinderWithShortestRadiusTest2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals(sList.findSpherocylinderWithShortestRadius(), 
         null);
   }
   
   /** This method tests the findSpherocylinderwithLongestRadius method.
    */
   @Test public void findSpherocylinderWithLongestRadiusTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(sList.findSpherocylinderWithLongestRadius(), 
         sArray[2]);
      
   }
   
   /** This method tests the findSpherocylinderwithLongestRadius method
    *  and it makes sure it returns null when there isn't anything in the array.
    */
   @Test public void findSpherocylinderWithLongestRadiusTest2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals(sList.findSpherocylinderWithLongestRadius(), 
         null);
   }
   
   /** This method tests the findSpherocylinderwithSmallestVolume method.
    */
   @Test public void findSpherocylinderWithSmallestVolumeTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(sList.findSpherocylinderWithSmallestVolume(), 
         sArray[0]);
   }
   
   /** This method tests the findSpherocylinderwithSmallestVolume method
    *  and it makes sure it returns null when there isn't anything in the array.
    */
   @Test public void findSpherocylinderWithSmallestVolumeTest2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals(sList.findSpherocylinderWithSmallestVolume(), 
         null);
   }

   /** This method tests the findSpherocylinderwithLargestVolume method.
    */
   @Test public void findSpherocylinderWithLargestVolumeTest1()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      sArray[0] = new Spherocylinder("Small Example", 2.0, 5.0);
      sArray[1] = new Spherocylinder("Medium Example", 10.0, 25.0);
      sArray[2] = new Spherocylinder("Large Example", 50.0, 125.0);
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 3);
      
      Assert.assertEquals(sList.findSpherocylinderWithLargestVolume(), 
         sArray[2]);
   }
   
   /** This method tests the findSpherocylinderwithLargestVolume method
    *  and it makes sure it returns null when given an empty array.
    */
   @Test public void findSpherocylinderWithLargestVolumeTest2()
   {
      Spherocylinder[] sArray = new Spherocylinder[100];
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", 
         sArray, 0);
      
      Assert.assertEquals(sList.findSpherocylinderWithLargestVolume(), 
         null);
   }
}
