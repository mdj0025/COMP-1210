/** This is a child class for the project.
 *
 * Activity 10
 * Michael Johnson Comp1210 Section 003
 * 11-27-17
 */
public class OnlineBook extends OnlineTextItem
{
   protected String author;
   
   /** This method holds the constructor for the class.
    * @param nameIn -- renames name.
    * @param priceIn -- renames price.
    */
   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      
      author = "Author Not Listed";
   }
   
   /** This method holds the toString method for the class.
    * @return -- returns a string.
    */
   public String toString()
   {
      return name + " - " + author + ": $" + price;
   }
   
   /** This method is a mutator method for the author variable.
    * @param authorIn -- renames author.
    */
   public void setAuthor(String authorIn)
   {
      author = authorIn;
   }
  
}