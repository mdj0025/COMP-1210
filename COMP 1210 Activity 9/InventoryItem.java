/** This is a parent class for the project.
 *
 * Activity 10
 * Michael Johnson Comp1210 Section 003
 * 11-27-17
 */
public class InventoryItem
{
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /** This is the constructor for the InventoryItem class.
    * @param nameIn -- renames name.
    * @param priceIn -- renames price.
    */
   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;   
   }
   
   /** This is a accessor method for the name.
    * @return -- returns the name.
    */
   public String getName()
   {
      return name;
   }
   
   /** This method calculates the cost with tax.
    * @return -- returns the final price.
    */
   public double calculateCost()
   {
      double cost = price * (1 + taxRate);
      
      return cost;
   }
   
   /** This method is a mutator method for the tax.
    * @param taxRateIn -- renames taxRate.
    */
   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
   
   /** This method contains the toString method for the class.
    * @return -- returns a string.
    */
   public String toString()
   {
      return name + ": $" + calculateCost();
   }
   
   
}