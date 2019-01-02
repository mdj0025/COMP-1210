import java.util.Scanner;

/**
 * This class contains methods using constructors in the Spherocylinder class. 
 *
 * Project 04
 * Michael Johnson Comp1210 Section 003
 * 09-27-17
 */
public class SpherocylinderApp
{
   /** The main method contains methods to obtain and print objects. 
    * @param args Command line arguments -- not used.
    */
   
   public static void main(String[] args)
   {
   
      Spherocylinder sphero1;
      double radius = 0;
      double cylinderHeight = 0;
      String label = "";
      
      
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter label, radius, and cylinder height for a" 
         + " spherocylinder.");
      System.out.print("\n\tlabel: ");
      label = (userInput.nextLine());
      
      System.out.print("\tradius: ");
      radius = (userInput.nextDouble());
      
      if (radius < 0)
      {
         System.out.print("Error: radius must be non-negative.");
         return;
      }
      
      System.out.print("\tcylinder height: ");
      cylinderHeight = (userInput.nextDouble());
      
      if (cylinderHeight < 0)
      {
         System.out.print("Error: cylinder height must be non-negative.");
         return;
      }
      sphero1 = new Spherocylinder(label, radius, cylinderHeight);

      System.out.println("");
      
      System.out.println(sphero1);
      
   }
   
}
