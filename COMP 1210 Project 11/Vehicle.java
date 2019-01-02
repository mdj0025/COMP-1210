import java.text.DecimalFormat;

/** This program is the parent class for the project.
 *
 * Project 11
 * Michael Johnson Comp1210 Section 003
 * 12-08-17
 */
public abstract class Vehicle implements Comparable<Vehicle>
{
   //instance variables
   protected String owner;
   protected String yearMakeModel;
   protected double value;
   protected boolean altFuel;
   
   protected static int vehicleCount;
   
   /** This method is the constructor for the superclass.
    *
    * @param ownerIn -- renames owner.
    * @param yearMakeModelIn -- renames yearMakeModel.
    * @param valueIn -- renames value.
    * @param altFuelIn -- renames altFuel.
    * @throws NegativeValueException -- if the value is negative.
    */
   public Vehicle(String ownerIn, String yearMakeModelIn, 
      double valueIn, boolean altFuelIn) throws NegativeValueException
   {
      owner = ownerIn;
      yearMakeModel = yearMakeModelIn;
      value = valueIn;
      altFuel = altFuelIn;
      
      vehicleCount++;
      if (value < 0)
      {
         vehicleCount--;
         throw new NegativeValueException();
      }
   }
   
   /** This method is an accessor method for owner.
    * @return -- returns a String representing owner.
    */
   public String getOwner()
   {
      return owner;
   }
   
   /** This method is a mutator method for owner.
    * @param ownerIn -- renames owner.
    */
   public void setOwner(String ownerIn)
   {
      owner = ownerIn;
   }
   
   /** This method is an accessor method for yearMakeModel.
    * @return -- returns a String representing yearMakeModel.
    */
   public String getYearMakeModel()
   {
      return yearMakeModel;
   }
   
   /** This method is a mutator method for owner.
    * @param yearMakeModelIn -- renames yearMakeModel.
    */
   public void setYearMakeModel(String yearMakeModelIn)
   {
      yearMakeModel = yearMakeModelIn;
   }
   
   /** This method is an accessor method for value.
    * @return -- returns a double representing value.
    */
   public double getValue()
   {
      return value;
   }
   
   /** This method is a mutator method for value.
    * @param valueIn -- renames value.
    */
   public void setValue(double valueIn)
   {
      value = valueIn;
   }
   
   /** This method is an accessor method for alternativeFuel.
    * @return -- returns a boolean condition representing fuel status.
    */
   public boolean getAlternativeFuel()
   {
      return altFuel;
   }
   
   /** This method is a mutator method for alternativeFuel.
    * @param altFuelIn -- renames altFuel.
    */
   public void setAlternativeFuel(boolean altFuelIn)
   {
      altFuel = altFuelIn;
   }
   
   /** This method is an accessor method for vehicle.
    * @return -- returns a String representing owner.
    */
   public static int getVehicleCount()
   {
      return vehicleCount;
   }
   
   /** This method resets vehicleCount.
    */
   public static void resetVehicleCount()
   {
      vehicleCount = 0;
   }
   
   /** This is an abstract method for calculating tax.
    * @return -- returns a double.
    */
   public abstract double useTax();
   
   /** This method holds the toString method.
    * @return -- returns a String representing the output.
    */
   public String toString()
   {
      String output = "";
      DecimalFormat fmt = new DecimalFormat("###,###.00");
      String value01 = fmt.format(value);
      if (altFuel)
      {
         output = owner + ": " + this.getClass().getName() 
            + " " + yearMakeModel + " (Alternative Fuel)\nValue: $" + value01 
            + " Use Tax: $" + fmt.format(useTax()) + "\n";     
      }
      else
      {
         output = owner + ": " + this.getClass().getName() 
            + " " + yearMakeModel + "\nValue: $" + value01 
            + " Use Tax: $" + fmt.format(useTax()) + "\n";
      }
      
      return output;  
   }
   
   /** This method uses the compareTo method.
    * @param vehicleIn -- passes in a vehicle object.
    * @return -- returns an int.
    */
   public int compareTo(Vehicle vehicleIn)
   {
      return this.owner.compareTo(vehicleIn.owner);
   }
   /** This method returns a boolean if they are equal.
    * @param obj -- takes in an object
    * @return -- returns a boolean.
    */
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Vehicle))
      {
         return false;
      }
      else
      {
         Vehicle other = (Vehicle) obj;
         return (owner + yearMakeModel + value).
            equals(other.owner + other.yearMakeModel + other.value);
      }
   }
   
   /** This method does the hash code.
    * @return -- returns 0;
    */
   public int hashCode()
   {
      return 0;
   }
}