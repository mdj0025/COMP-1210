/**
 * This program contains methods used in NumberOperations.
 *
 * Activity 05
 * Michael Johnson Comp1210 Section 003
 * 10-04-17
 */
public class NumberOperations
{
   private int number;
   
   /** This methos renames number. 
    *@param numberIn -- renames number
    */
   public NumberOperations(int numberIn)
   {
      number = numberIn;  
   }
   
   /** This method returns the number.
    *@return -- returns number
    */
   public int getValue()
   {
      return number; // placeholder return
   }
   
   /** This method calculates the odds under.
    *@return -- returns the output
    */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /** This methos calculates the powers two under number.
    *@return -- returns output
    */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**This methos compares number to compareNumber.
    *@param compareNumber -- used against number
    *@return -- returns the value if it is >, < , =
    */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
      {
         return 1;
      }
      
      else if (number < compareNumber)
      {
         return -1;
      }
      
      else
      {
         return 0;
      }
   }
  
   /** This method holds the toString method for the class.
    *@return -- returns the number and a string
    */
   public String toString()
   {
      return number + "";
   }

}