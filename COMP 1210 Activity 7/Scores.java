/** The Scores class takes in an array of numbers for evaluation.
 *
 * Activity 07
 * Michael Johnson Comp1210 Section 003
 * 10-23-17
 */
public class Scores
{
   private int[] numbers;
   
   /** The Scores constructor initalizes numbers to numbersIn.
    * @param numbersIn -- renames numbers.
    */
   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
   }
   
   /** The findEvens method finds the even numbers in the Array. 
    * @return -- returns even numbers.
    */
   public int[] findEvens()
   {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /** The findOdds method finds all of the odd values in the array.
    * @return -- returns the odd numbers.
    */
   public int[] findOdds()
   {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 1)
         {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 1)
         {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /** The calculateAverage method calculates the average of the array.
    * @return -- returns the average.
    */
   public double calculateAverage()
   {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      }
      double average = ((double) sum / (double) numbers.length);
      
      return average;
   }
   
   /** The toString method prints the array.
    * @return -- returns the result.
    */
   public String toString()
   {
      String result = "";
       
      for (int i = 0; i < numbers.length; i++)
      {
         result += numbers[i] + "\t";
      }
       
      return result;
   
   }
   
   /** The toStringInReverse method prints the array in reverse.
    * @return -- returns the string.
    */
   public String toStringInReverse()
   {
      String result = "";
      
      for (int i = numbers.length - 1; i > -1; i--)
      {
         result += numbers[i] + "\t";
      }
      
      return result;
   }

}