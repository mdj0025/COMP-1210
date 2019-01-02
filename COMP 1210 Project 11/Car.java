/** This program is a child class of superclass vehicle.
 *
 * Project 11
 * Michael Johnson Comp1210 Section 003
 * 12-08-17
 */
public class Car extends Vehicle
{
   /** This is a constant used in the class.
    */
   public static final double TAX_RATE = 0.01;
   /** This is a constant used in the class.
    */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
   /** This is a constant used in the class.
    */
   public static final double LUXURY_THRESHOLD = 50_000;
   /** This is a constant used in the class.
    */
   public static final double LUXURY_TAX_RATE = 0.02;
   
   /** This method holds the constructor for the Car class.
    *
    * @param ownerIn -- renames owner.
    * @param yearMakeModelIn - renames yearMakeModel.
    * @param valueIn -- renames value.
    * @param altFuelIn -- renames altFuel.
    * @throws NegativeValueException -- throws an Exception 
    * if the value is negative.
    */
   public Car(String ownerIn, String yearMakeModelIn, 
      double valueIn, boolean altFuelIn) throws NegativeValueException
   {
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);     
   }
   
   /** This method implements the abstract useTax method.
    * @return -- returns the tax ammount.
    */
   public double useTax()
   {
      double tax = 0;
      if (altFuel)
      {
         tax = value * ALTERNATIVE_FUEL_TAX_RATE;
         
         if (value > LUXURY_THRESHOLD)
         {
            tax = value * (LUXURY_TAX_RATE + ALTERNATIVE_FUEL_TAX_RATE);
         }
      }
      
      if (!altFuel)
      {
         tax = value * TAX_RATE;
         
         if (value > LUXURY_THRESHOLD)
         {
            tax = value * (LUXURY_TAX_RATE + TAX_RATE);
         }

      }
      
            
      return tax; 
   }
   
   /** This method holds the toString method.
    * @return -- returns a string for the output.
    */
   public String toString()
   {
      String output = "";
      if (value > LUXURY_THRESHOLD)
      {
         output = super.toString() + "with Tax Rate: "
            + TAX_RATE + " Luxury Tax Rate: " + LUXURY_TAX_RATE;
         if (altFuel)
         {
            output = super.toString() + "with Tax Rate: "
               + ALTERNATIVE_FUEL_TAX_RATE + " Luxury Tax Rate: " 
                  + LUXURY_TAX_RATE;
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