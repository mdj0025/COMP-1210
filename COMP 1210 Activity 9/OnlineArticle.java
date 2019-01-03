/** This is a child class for the project.
 *
 * Activity 10
 * Michael Johnson Comp1210 Section 003
 * 11-27-17
 */
public class OnlineArticle extends OnlineTextItem
{
   private int wordCount;
   
   /** This method holds the constructor for the class.
    * @param nameIn -- renames name.
    * @param priceIn -- renames price.
    */
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      
      wordCount = 0;
   }
   
   /** This methos sets the word count.
    * @param wordCountIn -- renames wordCount.
    */
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
   
   
}

   