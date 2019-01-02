import java.util.ArrayList;
 import java.text.DecimalFormat;
 /**
  * This class contains constructors and return statements for the project.
  *
  * Project 05
  * Michael Johnson Comp1210 Section 003
  * 10-10-17
  */
  
  
 public class SpherocylinderList
 {
    private String name = "";
    private ArrayList<Spherocylinder> sList;
    
    
    /** This constructor stores and renames variables.     
     * @param nameIn -- renames name.
     * @param sListIn -- renames sList.
     */
    public SpherocylinderList(String nameIn, 
       ArrayList<Spherocylinder> sListIn)
    {
       name = nameIn;
       sList = sListIn;   
    }
    
    /** This method returns the listName variable.
     * @return -- returns the listName variable.
     */
    public String getName()
    {
       return name;
    }
    
    /** This method returns the list size.
     * @return -- returns the list size.
     */
    public int numberOfSpherocylinders()
    {
       return sList.size();
    }
    
    /** This method calculates the total surface area.
     * @return -- returns the total value.
     */
    public double totalSurfaceArea()
    {
       double total = 0;
       
       int index = 0;
       while (index < sList.size())
       {
          total += sList.get(index).surfaceArea();
          index++;
       }
       
       return total;
    }
    
    /** This method calculates the total volume.
     * @return -- returns the value of totalVol.
     */
    public double totalVolume()
    {
       double totalVol = 0;
       int index = 0;
       while (index < sList.size())
       {
          totalVol += sList.get(index).volume();
          index++;
       }
       
       return totalVol;
    }
    
    /** This method calcularts the average surface area.
     * @return -- returns the average surface area.
     */
    public double averageSurfaceArea()
    {
       double avgSurfaceArea = 0;
       int index = 0;
       if (index < sList.size())
       {
          while (index < sList.size())
          {
             avgSurfaceArea += sList.get(index).surfaceArea();
             index++;
          }
          avgSurfaceArea /= sList.size();
       } 
       
       
       return avgSurfaceArea;           
    
    }
    
    /** This method calculates the average volume of a spherocylinder.
     * @return -- returns the average volume.
     */
    public double averageVolume()
    {
       double avgVolume = 0;
       int index = 0;
       if (index < sList.size())
       {
          while (index < sList.size())
          {
             avgVolume += sList.get(index).volume();
             index++;
          }
       
          avgVolume /= sList.size();
       }
       return avgVolume;
    }
    
    /** This method holds the toString method.
     * @return -- returns the result.
     */
    public String toString()
    {
       String result = name + "\n";
       int index = 0;
       while (index < sList.size())
       {
          result += "\n" + sList.get(index) + "\n";
          index++;
       }
       return result;
    }
     
    /** This method holds the summary info of statements to be printed. 
     * @return -- returns the result.
     */
    public String summaryInfo()
    {
       DecimalFormat df = new DecimalFormat("#,##0.0##");
       String result = "";
       if (sList.size() < 1)
       {
          result += "----- Summary for Spherocylinder Empty Test List -----";
          result += "\nNumber of Spherocylinders: " 
             + numberOfSpherocylinders();
          result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
          result += "\nTotal Volume: " + df.format(totalVolume());
          result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
          result += "\nAverage Volume: " + df.format(averageVolume());
       
       }
       
       else
       {
          result += "----- Summary for Spherocylinder Test List -----";
          result += "\nNumber of Spherocylinders: " 
             + numberOfSpherocylinders();
          result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
          result += "\nTotal Volume: " + df.format(totalVolume());
          result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());	  	
          result += "\nAverage Volume: " + df.format(averageVolume());	
       } 	
       
       return result;  	
    }	  	
 
	  	
 
 	  	
 }