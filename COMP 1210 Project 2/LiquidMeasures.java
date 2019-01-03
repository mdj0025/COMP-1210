import java.util.Scanner;

/**
 * This program calculates different measurements of liquid.
 *
 * Project 02
 * Michael Johnson Comp1210 Section 003
 * 09-05-17
 */
public class LiquidMeasures
{
   /**
    * The main method contains calculations for liquid measurements.
    * @param args Command line arguments -- not used.
    */ 
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      int ounces = 0;
      
      int barrels = 0;
      
      int gallons = 0;
      
      int quarts = 0;
      
      int remainingOunces = 0;
      
      // Gathers the information needed for calculations.
      System.out.print("Enter amount of liquid in ounces: ");
      ounces = userInput.nextInt();
      
      if (ounces >= 1000000000)
      {
         System.out.println("Amount must not exceed 1,000,000,000.");
         
      }
      
      else
      {
      
         barrels = ounces / 5376;
      
         gallons = (ounces - (barrels * 5376)) / 128;
      
         quarts = ((ounces - (barrels * 5376)) - (gallons * 128)) / 32;
         
         remainingOunces = (ounces - (barrels * 5376) 
            - (gallons * 128)) - (quarts * 32);
      
         System.out.println("Measures by volume:");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + remainingOunces);
         System.out.println(ounces + " oz = (" + barrels + " bl * 5376 oz) +"
            + " (" + gallons + " gal * 128 oz) + ("
            + quarts + " qt * 32 oz) + (" + remainingOunces + " oz)");
      }
      
   }
}