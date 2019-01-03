 /** This program is a child class of superclass vehicle.
  *
  * Project 10
  * Michael Johnson Comp1210 Section 003
  * 12-02-17
  */
 public class Motorcycle extends Vehicle
 {
    protected double engineSize;
    /** This is a constant for the class.*/
    public static final double TAX_RATE = 0.005;
    /** This is a constant for the class.*/
    public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
    /** This is a constant for the class.*/
    public static final double LARGE_BIKE_CC_THRESHOLD = 499;
    /** This is a constant for the class.*/
    public static final double LARGE_BIKE_TAX_RATE = 0.015;
    
    /** This method holds the constructor for the class.
     *
     * @param ownerIn -- renames owner.
     * @param yearMakeModelIn -- renames yearMakeModel
     * @param valueIn -- renames value.
     * @param altFuelIn -- renames altFuel.
     * @param engineSizeIn -- renames engineSize.
     */
    public Motorcycle(String ownerIn, String yearMakeModelIn, 
       double valueIn, boolean altFuelIn, double engineSizeIn)
    {
       super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);
       
       engineSize = engineSizeIn;
    }

    /** This method is an accessor method for engine size.
     * @return -- returns a double.
     */
    public double getEngineSize()
    {
       return engineSize;
    }
    
    /** This method is a mutator method for engine size.
     * @param engineSizeIn - renames engineSize.
     */
    public void setEngineSize(double engineSizeIn)
    {
       engineSize = engineSizeIn;
    }
    
    /** This method holds the useTax method for the Motorcycle class.
     * @return -- returns a double representing tax.
     */
    public double useTax()
    {
       double tax = 0;
       if (altFuel)
       {
          tax = value * ALTERNATIVE_FUEL_TAX_RATE;
          
          if (engineSize > LARGE_BIKE_CC_THRESHOLD)
          {
             tax += value * (LARGE_BIKE_TAX_RATE);
          }
       }
       
       if (!altFuel)
       {
          tax = value * TAX_RATE;
          
          if (engineSize > LARGE_BIKE_CC_THRESHOLD)
          {
             tax += value * (LARGE_BIKE_TAX_RATE);
          }
 
       }
       
       return tax;
    }
    
    /** This method holds the toString method for motorcycle.
     * @return -- returns a String.
     */
    public String toString()
    {
       String output = "";
       if (altFuel)
       {
          output = super.toString() + "with Tax Rate: " 
             + ALTERNATIVE_FUEL_TAX_RATE;      
       }
       else
       {
          output = super.toString() + "with Tax Rate: " 
             + TAX_RATE;
       }
       
       if (engineSize > LARGE_BIKE_CC_THRESHOLD)
       {
          output += " Large Bike Tax Rate: " + LARGE_BIKE_TAX_RATE;
             
          
       }
       
       return output;
    }
 
 }