import java.util.ArrayList;
 import java.text.DecimalFormat;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 /**
  * This class contains constructors and return statements for the project.
  *
  * Project 06
  * Michael Johnson Comp1210 Section 003
  * 10-19-17
  */
  
  
 public class SpherocylinderList
 {
    private String listName = "";
    private ArrayList<Spherocylinder> sList;
    
    
    /** This constructor stores and renames variables.     
     * @param listNameIn -- renames name.
     * @param sListIn -- renames sList.
     */
    public SpherocylinderList(String listNameIn, 
       ArrayList<Spherocylinder> sListIn)
    {
       listName = listNameIn;
       sList = sListIn;   
    }
    
    /** This method returns the listName variable.
     * @return -- returns the listName variable.
     */
    public String getName()
    {
       return listName;
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
       String result = listName + "\n";
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
    
    
    
    /** This method gets the list.
     * @return -- returns the list
     */ 
    public ArrayList<Spherocylinder> getList()
    {
       return sList;   
    }
    
    /** This method reads in a new file.
     * @param fileNameIn -- takes in the name for the file.
     * @throws FileNotFoundException if the file cannot be opened.
     * @return -- returns the list
     */
    public SpherocylinderList readFile(String fileNameIn)
                                        throws FileNotFoundException 
    {
       
       
       Scanner scanFile = new Scanner(new File(fileNameIn));
       ArrayList<Spherocylinder> myList = new ArrayList<Spherocylinder>();
       
       String labelIn = "";
       double radiusIn = 0, cylinderHeightIn = 0;
       
       listName = scanFile.nextLine();
       
       while (scanFile.hasNext())
       {
          labelIn = scanFile.nextLine();
          radiusIn = Double.parseDouble(scanFile.nextLine());
          cylinderHeightIn = Double.parseDouble(scanFile.nextLine());
          Spherocylinder s = new Spherocylinder(labelIn, 
             radiusIn, cylinderHeightIn);
          myList.add(s);
       }
       
       SpherocylinderList sL = new SpherocylinderList(listName, myList);
       
       return sL;
    }
    
    /** This method adds a spherocylinder to the ArrayList.
     * @param label2In -- takes in the label to be added
     * @param rIn -- takes in the radius to be added
     * @param cylHeightIn -- takes in the cylinderHeight to be added
     */
    public void addSpherocylinder(String label2In, 
       double rIn, double cylHeightIn)
    {
       Spherocylinder s = new Spherocylinder(label2In, rIn, cylHeightIn);
       
       sList.add(s);
       
       
    }
    
    
    /** This method finds a spherocylinder object based on user input.
     * @param labelIn -- renames label
     * @return -- returns spherocylinder object
     */
    public Spherocylinder findSpherocylinder(String labelIn)
    {
       Spherocylinder spherocyl;
       int index = -1; 
       for (Spherocylinder s: sList) {
          if (s.getLabel().equalsIgnoreCase(labelIn)) 
          {
             index = sList.indexOf(s);
             break;
          }
          
       }
       if (index >= 0)
       {
          spherocyl = sList.get(index);
          return spherocyl;
       }
       
       else
       {
          return null;
       }
          
     
    
    }
 
    
       
    /** This method deletes a spherocylinder from the list.
     * @param label2In -- takes in the label to be deleted
     * @return  -- returns a boolean value for the result
     */
    public Spherocylinder deleteSpherocylinder(String label2In)
    {
       Spherocylinder sphero11 = findSpherocylinder(label2In);
       int index = -1;
                
       if (label2In == null)
       {
          return null;
       }
          
       else
       {
          sList.remove(sphero11);
          return sphero11;
          
       }
          
    
    
    }
    
    /** This method edits a spherocylinder object besed on user input.
     * @param label -- takes in the label
     * @param radius -- takes in the radius
     * @param cylinderHeight -- takes in the cylinder height
     * @return -- returns boolean result
     */
    public boolean editSpherocylinder(String label, 
       double radius, double cylinderHeight)
    {
       boolean result = false;
       Spherocylinder spherocyl2 = findSpherocylinder(label);
       if (findSpherocylinder(label) != null)
       {
          result = true;
          spherocyl2.setRadius(radius);
          spherocyl2.setCylinderHeight(cylinderHeight);
             
       }
             
       
       
       return result;
    }
    
 }