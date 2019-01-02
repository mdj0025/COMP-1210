import java.text.DecimalFormat;
 /**
  * This class contains constructors and variables for the program.
  *
  * Project 07
  * Michael Johnson Comp1210 Section 003
  * 10-26-17
  */
  
 public class Spherocylinder
 {
    // instance variables
    private String label = "";
    private double radius = 0;
    private double cylinderHeight = 0;
    
    /** This constructor stores and renames variables.
     * @param labelIn -- renames label
     * @param radiusIn -- renames radius
     * @param cylinderHeightIn -- renames cylinderHeight
     */
    public Spherocylinder(String labelIn, double radiusIn, 
       double cylinderHeightIn)
    {  
       setLabel(labelIn);
       setRadius(radiusIn);
       setCylinderHeight(cylinderHeightIn);
    }
    /**
     * This string method accepts no parameters and returns label.
     * @return -- returns label
     */
    public String getLabel()
    {  
    
       return label;
    
    }
    /** This method checks is the label is empty, if not it trims the label.
     * @param labelIn -- used in boolean condition
     * @return -- returns a boolean condition
     */
    public boolean setLabel(String labelIn)
    { 
       boolean isSet = false;
       if (labelIn != null)
       {
          label = labelIn.trim();
          isSet = true;
       }
       
       return isSet;
    }
    /** This method accepts no parameters and returns the radius.
     * @return -- returns the radius
     */ 
    public double getRadius()
    {
       return radius;
    }
    /** This method checks if the radius is positive.
     * @param radiusIn -- used in boolean condition.
     * @return -- returns a boolean condition.
     */
    public boolean setRadius(double radiusIn)
    {
       boolean isSet = false;
       if (radiusIn >= 0)
       {
          radius = radiusIn;
          isSet = true;
       
       }
       return isSet;
    }
    /** This method returns the cylinder height.
     * @return -- returns cylinderHeight
     */
    public double getCylinderHeight()
    {
       return cylinderHeight;
    }
    /** This method checks if the cylinder height is positive.
     * @param cylinderHeightIn -- used in boolean condition
     * @return -- returns a boolean condition
     */
    public boolean setCylinderHeight(double cylinderHeightIn)
    {
       boolean isSet = false;
       if (cylinderHeightIn >= 0)
       {
          cylinderHeight = cylinderHeightIn;
          isSet = true;
       }
       
       return isSet;
    }
 
    /** This method defines the circumference of the sphyrocylinder.
     * @return -- returns the circumference value
     */
    public double circumference()
    {
       double circumference = 2.0 * Math.PI * radius;
        
       return circumference;
    
    }
    /** This method calculates the value for the surface area.
     *@return -- returns the surface area
     */
    public double surfaceArea()
    {
       double surfaceArea = 2 * Math.PI * radius * (2 * radius + cylinderHeight);
       return surfaceArea;
    }
    /** This method calculates the volume.
     * @return -- returns the volume
     */
    
    public double volume()
    { 
       double volume = Math.PI * Math.pow(radius, 2) 
          * ((4.0 / 3.0) * radius + cylinderHeight);
       return volume;
    }
    
    /** This method takes in calculated values and puts them in a string.
     * @return -- returns output
     */
    public String toString()
    {
       DecimalFormat fmt = new DecimalFormat("#,##0.00#");
       
       String output = "Spherocylinder \"" + label + "\" with radius " + radius 
          + " and cylinder height " + cylinderHeight + " has:";
       output += "\n\tcircumference = " + fmt.format(circumference()) + " units";
       output += "\n\tsurface area = " + fmt.format(surfaceArea()) 
          + " square units";
       output += "\n\tvolume = " + fmt.format(volume()) + " cubic units";
            
       return output;
    }
 }