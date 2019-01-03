/** This class contains methods for evaluating the customer.
 *
 * Activity 08B
 * Michael Johnson Comp1210 Section 003
 * 11-06-17
 */

public class Customer implements Comparable<Customer>
{
   // Instance vatiables
   private String name;
   private String location;
   private double balance;
   
   
   /** This method holds the constructor for the class.
    * @param nameIn -- renames name.
    */
   public Customer(String nameIn)
   {
      name = nameIn;
      location = "";
      balance = 0;    
   }
   
   /** This method sets the customer's location.
    * @param locationIn -- renames location
    */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   
   /** This method changes the customer's balance.
    * @param amount -- double value to balance by.
    */
   public void changeBalance(double amount)
   {
      balance += amount;
   }
   
   /** This is an accessor method to get the customer's location.
    * @return -- returns the location.
    */
   public String getLocation()
   {
      return location;
   }
   
   /** This is an accessor method to get the customer's balance.
    * @return -- returns the customer's balance.
    */
   public double getBalance()
   {
      return balance;
   }
   
   /** This method sets the location of the customer.
    * @param city -- holds the city that the user is located in.
    * @param state -- holds the state that the user is located in.
    */
   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   }
   
   /** This method holds the toString method for the customer class.
    * @return -- returns the string.
    */
   public String toString()
   {
      String output = name + "\n" + location + "\n$" + balance;
      
      return output;
   }
   
   /** This method compares the balance of the customer.
    * @param obj -- the name of the customer object.
    * @return -- returns an int for comparing.
    */
   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001)
      {
         return 0;
      }
      
      else if (this.balance < obj.getBalance())
      {
         return -1;
      }
      
      else
      {
         return 1;
      }
   }
   
         
   
   }

}