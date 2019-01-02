import java.text.DecimalFormat;
 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 /**
  * This class contains constructors and return statements for the project.
  *
  * Project 08B
  * Michael Johnson Comp1210 Section 003
  * 11-10-17
  */
  
  
 public class SpherocylinderList2
 {
    private String listName = "";
    private Spherocylinder[] spheroArray;
    private int numArray;
    
    
    /** This constructor stores and renames variables.     
     * @param listNameIn -- renames name.
     * @param spheroArrayIn -- renames spheroArray.
     * @param numArrayIn -- renames numArray.
     */
    public SpherocylinderList2(String listNameIn, 
       Spherocylinder[] spheroArrayIn, int numArrayIn) 
       
    {
       listName = listNameIn;
       numArray = numArrayIn;
       spheroArray = spheroArrayIn;   
    }
    
    /** This method returns the listName variable.
     * @return -- returns the listName variable.
     */
    public String getName()
    {
       return listName;
    }
    
       
    
    /** This method returns the Array length.
     * @return -- returns the Array length.
     */
    public int numberOfSpherocylinders()
    {
       return numArray;
    }
    
    /** This method calculates the total surface area.
     * @return -- returns the total value.
     */
    public double totalSurfaceArea()
    {
       double total = 0;
       
       int index = 0;
       while (index < numArray)
       {
          total += spheroArray[index].surfaceArea();
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
       while (index < numArray)
       {
          totalVol += spheroArray[index].volume();
          index++;
       }
       
       return totalVol;
    }
    
    /** This method calculates the average surface area.
     * @return -- returns the average surface area.
     */
    public double averageSurfaceArea()
    {
       double avgSurfaceArea = 0;
       int index = 0;
       if (index < numArray)
       {
          while (index < numArray)
          {
             avgSurfaceArea += spheroArray[index].surfaceArea();
             index++;
          }
          avgSurfaceArea /= numArray;
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
       if (index < numArray)
       {
          while (index < numArray)
          {
             avgVolume += spheroArray[index].volume();
             index++;
          }
       
          avgVolume /= numArray;
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
       while (index < numArray)
       {
          result += "\n" + spheroArray[index] + "\n";
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
       String result2 = "";
       if (numArray < 1)
       {
          result2 += "----- Summary for Spherocylinder Empty Test List -----";
          result2 += "\nNumber of Spherocylinders: " 
             + numberOfSpherocylinders();
          result2 += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
          result2 += "\nTotal Volume: " + df.format(totalVolume());
          result2 += "\nAverage Surface Area: " 
             + df.format(averageSurfaceArea());
          result2 += "\nAverage Volume: " + df.format(averageVolume());
       
       }
       
       else
       {
          result2 += "----- Summary for Spherocylinder Test List -----";
          result2 += "\nNumber of Spherocylinders: " 
             + numberOfSpherocylinders();
          result2 += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
          result2 += "\nTotal Volume: " + df.format(totalVolume());
          result2 += "\nAverage Surface Area: " 
             + df.format(averageSurfaceArea());
          result2 += "\nAverage Volume: " + df.format(averageVolume());
       }
       
       return result2;
    }
    
    
    
    /** This method gets the array.
     * @return -- returns the array.
     */ 
    public Spherocylinder[] getList()
    {
       return spheroArray;   
    }
    
    /** This method reads in a new file.
     * @param fileNameIn -- takes in the name for the file.
     * @throws FileNotFoundException if the file is empty.
     * @return -- returns the list
     */
    public SpherocylinderList2 readFile(String fileNameIn)
                                        throws FileNotFoundException 
    {
       Scanner scanFile = new Scanner(new File(fileNameIn));
       Spherocylinder[] myList = new Spherocylinder[100];
       
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
          myList[numArray] = s;
          numArray++;
       }
       
       SpherocylinderList2 sL = new SpherocylinderList2(listName, 
          myList, numArray);
       
       return sL;
    }
    
    /** This method adds a spherocylinder to the Array.
     * @param label2In -- takes in the label to be added
     * @param rIn -- takes in the radius to be added
     * @param cylHeightIn -- takes in the cylinderHeight to be added
     */
    public void addSpherocylinder(String label2In, 
       double rIn, double cylHeightIn)
    {
       Spherocylinder s = new Spherocylinder(label2In, rIn, cylHeightIn);
       spheroArray[numArray] = s;
       numArray++;
       
       
    }
    
    
    /** This method finds a spherocylinder object based on user input.
     * @param labelIn -- renames label
     * @return -- returns spherocylinder object
     */
    public Spherocylinder findSpherocylinder(String labelIn)
    {
       boolean result = false;
       Spherocylinder spherocyl;
       int index = -1; 
       for (int i = 0; i < numArray; i++) {
          if (spheroArray[i].getLabel().equalsIgnoreCase(labelIn)) 
          {
             index = i;
             break;   
          
          }
          
       }
       if (index >= 0)
       {
          spherocyl = spheroArray[index];
          return spherocyl;
       }
       
       else
       {
          return null;
       }
           
    
    }
 
    
       
    /** This method deletes a spherocylinder from the Array.
     * @param label2In -- takes in the label to be deleted
     * @return  -- returns a boolean value for the result
     */
    public Spherocylinder deleteSpherocylinder(String label2In)
    {
       Spherocylinder sphero = null;
       int index = -1;
       for (int i = 0; i < numArray; i++)
       {
          if (spheroArray[i].getLabel().equalsIgnoreCase(label2In))
          {
             sphero = spheroArray[i];
             for (int j = i; j < numArray - 1; j++)
             {
                spheroArray[j] = spheroArray[j + 1];
             }
             
             spheroArray[numArray - 1] = null;
             numArray--;
          }
       }
       
       return sphero;
          
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
    
    /** This method iterates through the array and finds the shortest Radius.
     * 
     * @return -- returns the spherocylinder object.
     */
    public Spherocylinder findSpherocylinderWithShortestRadius()
    {
       double smallest = 0;
       Spherocylinder spheroX = null; 
       for (int i = 0; i < numArray; i++)
       {
          if (i == 0)
          {
             smallest = spheroArray[i].getRadius();
          }      
          
          if (spheroArray[i].getRadius() <= smallest)
          {
             spheroX = spheroArray[i];
          }
          
       }
       return spheroX;
    }
    
    /** This method iterates through the array and finds the longest Radius.
     * 
     * @return -- returns the spherocylinder object.
     */
    public Spherocylinder findSpherocylinderWithLongestRadius()
    {
       double largest = 0;
       Spherocylinder spheroY = null;
       for (int i = 0; i < numArray; i++)
       {
          if (i == 0)
          {
             largest = spheroArray[i].getRadius();
             spheroY = spheroArray[i];
          } 
          if (spheroArray[i].getRadius() > largest)
          {
             spheroY = spheroArray[i];
          }
       }
       
       return spheroY;
    }
    
    /** This method iterates through the array and finds the smallest volume.
     * 
     * @return -- returns the spherocylinder object.
     */
 
    public Spherocylinder findSpherocylinderWithSmallestVolume()
    {
       double small = 0;
       Spherocylinder spheroZ = null;
       for (int i = 0; i < numArray; i++)
       {
          if (i == 0)
          {
             small = spheroArray[i].volume();
          }
          
          if (spheroArray[i].volume() <= small)
          {
             spheroZ = spheroArray[i];
          }
       }
       return spheroZ;
    } 
    
    /** This method iterates through the array and finds the largest volume.
     * 
     * @return -- returns the spherocylinder object.
     */
    public Spherocylinder findSpherocylinderWithLargestVolume()
    {
       double large = 0;
       Spherocylinder spheroW = null;
       for (int i = 0; i < numArray; i++)
       {
          if (i == 0)
          {
             large = spheroArray[i].volume();
             spheroW = spheroArray[i]; 
          }
          if (spheroArray[i].volume() > large)
          {
             spheroW = spheroArray[i];
          }
       }
       return spheroW;
    }
          
 }