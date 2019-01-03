/** This is a child class for the project.
 *
 * Activity 10
 * Michael Johnson Comp1210 Section 003
 * 11-27-17
 */
public class ElectronicsItem extends InventoryItem
{
   //instance variable
   protected double weight;
   /** This is a static constant.
    */
   public static final double SHIPPING_COST = 1.5;
   
   
   /** This method holds the constructor for the class.
    * @param nameIn -- renames name.
    * @param priceIn -- renames price.
    * @param weightIn -- renames weight.
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn)
   {
      super(nameIn, priceIn);
      weight = weightIn;
   } 
   
   /** This method calculates the cost with added shipping cost.
    * @return -- returns the price.
    */
   public double calculateCost()
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}