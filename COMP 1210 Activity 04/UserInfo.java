/**
 * This class contains constructors and variables used in another class.
 *
 * Activity 04
 * Michael Johnson Comp1210 Section 003
 * 09-25-17
 */
public class UserInfo 
{
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   /** This constructor stores variables.
    * @param firstNameIn -- renames firstName. 
    * @param lastNameIn -- renames lastName.
    */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }
   
   /** This method contains information on the output variable.
    * @return -- returns the output.
    */
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      return output;
   }
   /** This method renames location to locationIn.
    * @param locationIn -- renames location.
    */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   
   }
   /** This method determines if the age is > than zero and returns a value.
    * @param ageIn -- renames age.
    * @return -- returns a boolean type.
    */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
         
      return isSet;
         
   }
   /** This method returns the age.
    * @return -- returns the age.
    */
   public int getAge()
   {
      return age; 
   }
   /** This method returns the location.
    * @return -- returns the location.
    */
   public String getLocation()
   {
      return location;
   }
   /** This method determines the status of the user.
    */
   public void logOff()
   {
      status = OFFLINE;
   }
   /** This method determines the status of the user.
    */
   public void logOn()
   {
      status = ONLINE;
   }
      
   
   
   
}