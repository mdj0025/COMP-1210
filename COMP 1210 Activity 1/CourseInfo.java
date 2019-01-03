/** 
 * Prints a description of the course. 
 *
 * Activity 1B
 * Michael Johnson Comp1210 Section 3
 * 8-25-17
 */
public class CourseInfo
{
   /**
    * Prints course information to std output.
    *
    * @param args Command line arguments -- not used.
    */
   public static void main(String[] args) {
     
      // Prints course description.
      System.out.println("This course provides an introduction to Java and");
      System.out.println("object-oriented programming.");
      
      // Creates space between lines 2 & 4.
      System.out.println("");
      
      // Prints more course description.
      System.out.println("The course also introduces the basics of " 
         + "software development.");
   }
}