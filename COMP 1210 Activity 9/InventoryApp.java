/** This is a child class for the project.
 *
 * Activity 10
 * Michael Johnson Comp1210 Section 003
 * 11-27-17
 */
public class InventoryApp
{
   /** This method holds the main method for the project.
    * @param args -- not used.
    *
    */
   public static void main(String[] args)
   {
      InventoryItem.setTaxRate(0.05);
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      
      
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
   }
}