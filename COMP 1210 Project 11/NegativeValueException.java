/** This class holds a string value if a negative value is detected.
 *
 * Project 11 
 * Michael Johnson Comp 1210 Section 003
 * 12-08-17
 */
public class NegativeValueException extends Exception
{
   /** This method holds the string value.
    *
    */
   public NegativeValueException()
   {
      super("Numeric values must be nonnegative");
   }
}