/**
 * This class contains methods using variables from the UserInfo class.
 *
 * Activity 04
 * Michael Johnson Comp1210 Section 003
 * 09-25-17
 */
public class UserInfoDriver
{
   /** The main method contains information about different users.
    * @param args Command line arguments -- not used.
    */
   
   public static void main(String[] args)
   {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   
   }
}