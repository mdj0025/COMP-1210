 /** This program is a child class of superclass vehicle.
  *
  * Project 10
  * Michael Johnson Comp1210 Section 003
  * 12-02-17
  */
 public class SemiTractorTrailer extends Truck
 {
    protected int axles;
    
    /** This is a constant for the class. */
    public static final double PER_AXLE_TAX_RATE = 0.005;
    
    /** This method holds the constructor for the SemiTractorTrailer class.
     *
     * @param ownerIn -- renames owner.
     * @param yearMakeModelIn -- renames yearMakeModel.
     * @param valueIn -- renames value.
     * @param altFuelIn -- renames altFuel.
     * @param tonsIn -- renames tons.
     * @param axlesIn -- renames axles.
     */
    public SemiTractorTrailer(String ownerIn, String yearMakeModelIn, 
       double valueIn, boolean altFuelIn, double tonsIn, int axlesIn)
    {
       super(ownerIn, yearMakeModelIn, valueIn, altFuelIn, tonsIn);
       
       axles = axlesIn;
    }
    
    /** This method is an accessor method for axles.
     * @return -- returns an int.
     */
    public int getAxles()
    {
       return axles;
    }
    
    /** This method is a mutator method for axles.
     * @param axlesIn -- renames axles.
     */
    public void setAxles(int axlesIn)
    {
       axles = axlesIn;
    }
    
    /** This method holds the useTax method for semiTractorTrailer.
     * @return -- returns a double.
     */
    public double useTax()
    {
       double tax;
       tax = super.useTax();
       if (tons > LARGE_TRUCK_TONS_THRESHOLD)
       {
          tax += (value * PER_AXLE_TAX_RATE * axles);
       }
       
             
       return tax; 
    }
    
    /** This method holds the toString for SemiTractorTrailer.
     * @return -- returns a String.
     */
    public String toString()
    {
       
       if (tons > LARGE_TRUCK_TONS_THRESHOLD)
       { 
          return super.toString() + " Axle Tax Rate: " 
             + (PER_AXLE_TAX_RATE * axles); 
       }      
       else
       {
          return super.toString(); 
       }
    }
 }