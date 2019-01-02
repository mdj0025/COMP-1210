import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * This class contains methods used in an array list.
 *
 * Project 05
 * Michael Johnson Comp1210 Section 003
 * 10-10-17
 */

public class SpherocylinderListApp
{
   /** This main method contains methods used in other classes.
    * @param args -- not used.
    * @throws FileNotFoundException  -- if file is not found.
    */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<Spherocylinder> myList = new ArrayList<Spherocylinder>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
   
      Scanner scanFile = new Scanner(new File(fileName));
   
      String spherocylinderListName = scanFile.nextLine();
   
      while (scanFile.hasNext())
      {
         String labelIn = scanFile.nextLine();
         double radiusIn = Double.parseDouble(scanFile.nextLine());
         double cylinderHeightIn = Double.parseDouble(scanFile.nextLine());
      
         Spherocylinder s = new Spherocylinder(labelIn, radiusIn, 
            cylinderHeightIn);
         myList.add(s);
      }
      scanFile.close();
   
      SpherocylinderList mySpherocylinderList = 
         new SpherocylinderList(spherocylinderListName, myList);
   
      System.out.println();
      System.out.println(mySpherocylinderList);
      System.out.println();
      System.out.println(mySpherocylinderList.summaryInfo());
   }
}