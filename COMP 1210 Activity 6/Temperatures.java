import java.util.ArrayList;
/**
 * This class contains methods for dealing with temperatures.
 *
 * Activity 06
 * Michael Johnson Comp 1210 Section 003
 */
 
public class Temperatures
{
   private ArrayList<Integer> temperatures;
   
   /** This constructor contains an assignment statement.
    * @param temperaturesIn -- renames temperatures
    */
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
   /** This method finds the lowest temperature in the array list.
    * @return -- returns lowest value
    */
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      
      int low = temperatures.get(0);
      
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;         
   
   }
   
   /** This method finds the highest temperature in the list.
    * @return -- returns the highest value
    */
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures)
      {
         if (temp > high)
         {
            high = temp;
         }
      
      }
      return high;
   }
   
   /** This method determines if there is a lower temperature in the list.
    * @param lowIn -- renames low 
    * @return -- returns a lower value if there is one
    */
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();      
   }
   
   /** This method deetermines if there is a higher temperature in the list.
    * @param highIn -- renames high
    * @return -- returns a higher value if there is one
    */
   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /** This method contains the toString method.
    * @return -- returns a string
    */
   public String toString()
   {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
   
   


}