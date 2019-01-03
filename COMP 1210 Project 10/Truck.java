/** This program is a child class of superclass vehicle.
  *
  * Project 10
  * Michael Johnson Comp1210 Section 003
  * 12-02-17
  */
 public class Truck extends Vehicle
 {
    protected double tons;
    /** This is a constant for the class. */
    public static final double TAX_RATE = 0.02;
    /** This is a constant for the class. */
    public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;
    /** This is a constant for the class. */
    public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;
    /** This is a constant for the class. */
    public static final double LARGE_TRUCK_TAX_RATE = 0.03;
    
    /** This method holds the constructor for the Truck class.
     * 
     * @param ownerIn -- renames owner.
     * @param yearMakeModelIn -- renames yearMakeModel.
     * @param valueIn -- renames value.
     * @param altFuelIn -- renames altFuel.
     * @param tonsIn -- renames tons.
     */
    public Truck(String ownerIn, String yearMakeModelIn, 
       double valueIn, boolean altFuelIn, double tonsIn)
    {
       super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);
       
       tons = tonsIn;
    }
    
    /** This method is an accessor method for tons.
     * @return -- returns tons.
     */
    public double getTons()
    {
       return tons;
    }
    
    /** This method is a mutator method for tons.
     * @param tonsIn -- renames tons.
     */
    public void setTons(double tonsIn)
    {
       tons = tonsIn;
    }
    
    /** This method calculates tax for the Truck class.
     * @return -- returns tons.
     */
    public double useTax()
    {
       double tax;
       if (altFuel)
       {
          tax = value * ALTERNATIVE_FUEL_TAX_RATE;
       }
       
       else
       {
          tax = value * TAX_RATE;
       }
       
       if (tons > LARGE_TRUCK_TONS_THRESHOLD)
       {
          tax += value * (LARGE_TRUCK_TAX_RATE);
       }
       return tax; 
    }
    
    /** This method holds the toString method for Truck. 
     * @return -- returns the output.
     */
    public String toString()
    {
       String output = "";
       if (tons > LARGE_TRUCK_TONS_THRESHOLD)
       {
          output = super.toString() + "with Tax Rate: " + TAX_RATE 
             + " Large Truck Tax Rate: " + LARGE_TRUCK_TAX_RATE;
          if (altFuel)
          {
             output = super.toString() + "with Tax Rate: " 
                + ALTERNATIVE_FUEL_TAX_RATE 
                + " Large Truck Tax Rate: " + LARGE_TRUCK_TAX_RATE;
          }
             
       }      
       else
       {
          output = super.toString() + "with Tax Rate: " + TAX_RATE;
          if (altFuel)
          {
             output = super.toString() + "with Tax Rate: " 
                + ALTERNATIVE_FUEL_TAX_RATE;
          }
       }
       
       return output;
    }
 }