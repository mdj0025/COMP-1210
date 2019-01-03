/** This is a child class for the project.
 *
 * Activity 10
 * Michael Johnson Comp1210 Section 003
 * 11-27-17
 */
public abstract class OnlineTextItem extends InventoryItem
{
   /** This method holds the constructor for the class.
    * @param nameIn -- renames name.
    * @param priceIn -- renames price.
    */
   public OnlineTextItem(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
   }
   
   /** This method uses an inherited method.
    * @return -- returns price.
    */
   public double calculateCost()
   {
      return price;
   }
}