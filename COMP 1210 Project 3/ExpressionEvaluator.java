import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * This program evaluates an expresson from user input.
 *
 * Project 03
 * Michael Johnson Comp1210 Section 003
 * 09-13-17
 */
public class ExpressionEvaluator
{
   /**
    * The main method evaluates an expression.
    * @param args Command line arguments -- not used.
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double equation = 0;
      String result = " ";
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      equation = (Math.sqrt(Math.abs(23.7 * Math.pow(x, 9)) - x)) 
         / (7.3 * Math.pow(x, 2) + 5.2 * x + 3.1);
         
      result = Double.toString(equation);
      
      int period = result.indexOf(".");
      
      int length = result.length();
      
      int numRight = (length - period) - 1;
      
      System.out.println("Result: " + equation);
      
      DecimalFormat fmt = new DecimalFormat("#,##0.0####");
      
      System.out.println("# digits to left of decimal point: " + period);
      System.out.println("# digits to right of decimal point: " + numRight);
      System.out.println("Formatted Result: " + fmt.format(equation)); 
   }

}