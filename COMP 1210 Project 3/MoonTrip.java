import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
 * This program decodes a ticket input by the user.
 *
 * Project 03
 * Michael Johnson Comp1210 Section 003
 * 09-18-17
 */
public class MoonTrip
{
   static final double STUDENT_DISCOUNT = .40;
   static final double EMPLOYEE_DISCOUNT = .20;  
   /**
    * The main method decodes a ticket value.
    * @param args Command line arguments -- not used.
    */  
   public static void main(String[] args)
   {      
      Scanner userInput = new Scanner(System.in);
   
      String ticket = " ";
      String ticket02 = " ";
      System.out.print("Enter ticket code: ");
      ticket = userInput.nextLine();
      
      ticket02 = ticket.trim();
      
      
      
      double cost = 0;
                
      if (ticket02.length() <= 25)
      {
         System.out.println(" ");
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 26 characters.");
          
      }
      
      else if (ticket02.length() >= 26)
      {
         String priceNumber = ticket02.substring(14, 20);
         double price = Double.parseDouble(priceNumber);
      
         DecimalFormat fmt = new DecimalFormat("###,##0.00");
         String price01 = fmt.format(price);
        
         System.out.println("");
         System.out.print("Date: " + ticket02.substring(0, 2) 
            + "/" + ticket02.substring(2, 4) + "/" + ticket02.substring(4, 8));
         System.out.print("   Time: " + ticket02.substring(8, 10) + ":" 
            + ticket02.substring(10, 12));
         System.out.print("   Seat: " + ticket02.substring(22, 25));
         
         System.out.println("\nItinerary: " + ticket02.substring(25));
         
         System.out.print("Price: $" + price01);
         System.out.print("   Category: " + ticket02.substring(12, 13));
           
         
         if (ticket02.charAt(12) == 's')
         {
            cost = price - (price * .40);
         }
         
         else if (ticket02.charAt(12) == 'e')
         {
            cost = price - (price * .20);
         }
         
         else
         {
            cost = price;
         }
         
         DecimalFormat x = new DecimalFormat("###,##0.00");
         String cost02 = x.format(cost);
         
         System.out.print("   Cost: $" + cost02); 
         
         Random generator = new Random();
         int prize = generator.nextInt(9999) + 1;
         DecimalFormat y = new DecimalFormat("0000");
         String prize02 = y.format(prize);         
         System.out.print("\nPrize Number: " + prize02);
            
      }
   }
}