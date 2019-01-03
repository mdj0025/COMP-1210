import java.util.Comparator;
 /** This program implements the Comparator on class Vehicle.
  *
  * Project 10
  * Michael Johnson Comp1210 Section 003
  * 12-01-17
  */
 public class UseTaxComparator implements Comparator<Vehicle>
 {
    /** This method compares the vehicle objects.
     * @param v1 -- vehicle object to be compared.
     * @param v2 -- vehicleobject to be compared.
     * @return -- returns an int representing the compare value.
     */
    public int compare(Vehicle v1, Vehicle v2)
    {
       if (v1.useTax() < v2.useTax())
       {
          return -1;
       }
       
       else if (v1.useTax() > v2.useTax())
       {
          return 1;
       }   
       
       else
       {
          return 0;
       }
    }      
 }