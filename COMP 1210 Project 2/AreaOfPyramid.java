import java.util.Scanner;

/**
 * This program calculates the Area of a pyramid.
 *
 * Project 02
 * Michael Johnson Comp1210 Section 003
 * 09-05-17
 */
public class AreaOfPyramid
{
   /**
    * The main method contains calculations for the area of a pyramid.
    * @param args Command line arguments -- not used.
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      double baseLength = 0;
      
      double slantHeight = 0;
      
      double area = 0;
      
      // Prompts the user to enter base and slant height:
      System.out.println("Enter values for base and"
         + " slant height of a pyramid:");
      
      // Asks and recieves the value of the base:
      System.out.print("\tbase = ");
      baseLength = userInput.nextDouble();
      
      // Asks and recieves the valus of the slant height:
      System.out.print("\tslant height = ");
      slantHeight = userInput.nextDouble();
      
      // Prints a blank line:
      System.out.println("");
      
      // Calculates the area based on user input:
      area = (baseLength * baseLength) + 4 * (baseLength * slantHeight) / 2;
      
      // Prints the calculated values to the screen: 
      System.out.println("A pyramid with base = " + baseLength 
         + " and slant height = " + slantHeight 
         + "\nhas an area of " +  area + " square units.");
   }
}