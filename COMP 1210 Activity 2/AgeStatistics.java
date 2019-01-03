import java.util.Scanner;

/**
 * This program displays general information about the user.
 *
 * Activity 02
 * Michael Johnson Comp1210 Section 003
 * 09-01-17
 */
public class AgeStatistics
{
   /**
    * Contains calculations on information about the user.
    * @param args Command line arguments -- not used.
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      String name = "";
      
      int ageInYears = 0;
      
      int gender = 0;
      
      double maxHeartRate = 0;
      
      // Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      // Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      // Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      // Convert age to minutes:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      // Convert age to centuries:
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
         
      // Display max heart rate
      
      if (gender == 1)
      { 
         maxHeartRate = 209 - (0.7 * ageInYears);
      
      }
      
      else
      { 
         maxHeartRate = 214 - (0.8 * ageInYears);
      
      }
      
      System.out.print("\tYour max heart rate is " 
         + maxHeartRate + " beats per minute.");
         
   }


}