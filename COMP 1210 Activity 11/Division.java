/** This program holds methods for the main method in Division Driver.
 *
 * Activity 11
 * Michael Johnson Comp1210 Section 003
 * 12-04-17
 */
public class Division
{
   /** This method performs integer division.
    *
    * @param numIn -- takes in an int for a numerator.
    * @param denomIn -- takes in an int for the denominator.
    * @return -- returns an int after division.
    */
   public static int intDivide(int numIn, int denomIn)
   {
      try
      {
         int result = numIn / denomIn;
      
         return result;
         
      }
      
      catch (ArithmeticException e)
      {
         return 0;
      }
      
   }
   
   /** This method performs division with ints and returns a double.
    *
    * @param decNumIn -- takes in an int for the numerator.
    * @param decDenomIn -- takes in an int for the denominator.
    * @return -- returns a double after division.
    */
   public static double decimalDivide(int decNumIn, int decDenomIn)
   {
      double result = (double) decNumIn / (double) decDenomIn;
      
      
      if (decDenomIn == 0)
      {
         throw new IllegalArgumentException(
            "The denominator " + "cannot be zero.");
      }
      
      return result;
   }
   
   

}