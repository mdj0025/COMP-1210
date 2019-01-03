/** This program is the UseTaxList class.
  *
  * Project 10
  * Michael Johnson Comp1210 Section 003
  * 12-01-17
  */
 import java.io.FileNotFoundException;
 import java.util.Scanner;
 import java.io.File;
 import java.util.Arrays;
 import java.text.DecimalFormat;
 
 /** This class contains methods for Vehicle.
  *
  */
 public class UseTaxList
 {
    private String taxDistrict;
    private Vehicle[] vehicleList;
    private String[] excludedRecords;
    
    /** This is the constructor for the class.
     *
     */
    public UseTaxList()
    {
       taxDistrict = "not yet assigned";
       vehicleList = new Vehicle[0];
       excludedRecords = new String[0];   
    }
    
    /** This method reads in a file and assigns it.
     * @param fileNameIn -- name of the file being accepted.
     * @throws FileNotFoundException if the file cannot be found.
     */
    public void readVehicleFile(String fileNameIn) throws FileNotFoundException
    {
       
       Scanner scanFile = new Scanner(new File(fileNameIn));
       
       taxDistrict = scanFile.nextLine();
       
       while (scanFile.hasNext())
       {
          String listName = scanFile.nextLine();
          Scanner findVehicle = new Scanner(listName).useDelimiter(";");
          String className = findVehicle.next().trim();
          char fixer = className.toUpperCase().charAt(0);
          switch (fixer)
          {
             case 'C' :
                String owner = findVehicle.next().trim();
                String yearMakeModel = findVehicle.next().trim();
                double value = Double.parseDouble(findVehicle.next().trim());
                boolean altFuel = 
                   Boolean.parseBoolean(findVehicle.next().trim());
                addVehicle(new Car(owner, 
                   yearMakeModel, value, altFuel));                 
                break;
                
             case 'T' :
                owner  = findVehicle.next().trim();
                yearMakeModel = findVehicle.next().trim();
                value = Double.parseDouble(findVehicle.next().trim());
                altFuel = Boolean.parseBoolean(findVehicle.next().trim());
                double tons = Double.parseDouble(findVehicle.next().trim());
                addVehicle(new Truck(owner, yearMakeModel, 
                   value, altFuel, tons));
                break;
                   
             case 'S' :
                owner = findVehicle.next().trim();
                yearMakeModel = findVehicle.next().trim();
                value = Double.parseDouble(findVehicle.next().trim());
                altFuel = Boolean.parseBoolean(findVehicle.next().trim());
                tons = Double.parseDouble(findVehicle.next().trim());
                int axles = Integer.parseInt(findVehicle.next().trim());
                addVehicle(new SemiTractorTrailer(owner, 
                   yearMakeModel, value, altFuel, tons, axles));
                break;
                   
             case 'M' :
                owner = findVehicle.next().trim();
                yearMakeModel = findVehicle.next().trim();
                value = Double.parseDouble(findVehicle.next().trim());
                altFuel = Boolean.parseBoolean(findVehicle.next().trim());
                double size = Double.parseDouble(findVehicle.next().trim());
                addVehicle(new Motorcycle(owner, 
                   yearMakeModel, value, altFuel, size));
                break;
                
             default :
                addExcludedRecord(listName);
                break;     
             
          }
          findVehicle.close();
       }
       scanFile.close();
       
 
        
    }
    
    /** This method retrieves the tax district.
     * @return -- returns the tax district.
     */
    public String getTaxDistrict()
    {
       return taxDistrict;
    }
    
    /** This method sets the tax district.
     * @param taxDistrictIn -- takes in a tax district.
     */
    public void setTaxDistrict(String taxDistrictIn)
    {
       taxDistrict = taxDistrictIn;
    }
    
    /** This method retrieves the vehicle list.
     * @return -- returns an array of type Vehicle.
     */
    public Vehicle[] getVehicleList()
    {
       return vehicleList;
    }
    
    /** This method retrieves the excluded records.
     * @return -- returns an array of type String.
     */
    public String[] getExcludedRecords()
    {
       return excludedRecords;
    }
    
    /** This method adds a vehicle to the array.
     * @param vehicleIn -- represents the new vehicle object.
     */
    public void addVehicle(Vehicle vehicleIn)
    {
       vehicleList = Arrays.copyOf(vehicleList, vehicleList.length + 1);
       vehicleList[vehicleList.length - 1] = vehicleIn;
    }
    
    /** This method adds an object to the excluded records. 
     * @param excludedRecordIn -- represents the new excluded record object.
     */
    public void addExcludedRecord(String excludedRecordIn)
    {
       excludedRecords = Arrays.copyOf(excludedRecords, 
          excludedRecords.length + 1);
       excludedRecords[excludedRecords.length - 1] = excludedRecordIn; 
    }
    
    /** This method contains the toString method.
     * @return -- returns a String object.
     */
    public String toString()
    {
       String result = " ";
       int index = 0;
       while (index < vehicleList.length)
       {
          result += "\n" + vehicleList[index] + "\n";
          index++;
       }
       
       return result;
    }
    
    /** This method calculates the total use tax in the array.
     * @return -- returns a double for the total tax.
     */
    public double calculateTotalUseTax()
    {
       double total = 0;
       for (int i = 0; i < vehicleList.length; i++)
       {
          total += vehicleList[i].useTax();
       }
       
       return total;
    }
    
    /** This method calculates the total value in the array.
     * @return -- returns a double for total value.
     */
    public double calculateTotalValue()
    {
       double total2 = 0;
       for (int i = 0; i < vehicleList.length; i++)
       {
          total2 += vehicleList[i].getValue();
       }
       
       return total2; 
    }
    
    /** This method holds the summary for all the objects.
     * @return -- returns a string for the summary.
     */
    public String summary()
    {
       DecimalFormat df = new DecimalFormat("###,###.00");
       String output = "------------------------------"
          + "\nSummary for " + getTaxDistrict()
          + "\n------------------------------"
          + "\nNumber of Vehicles: " + vehicleList.length
          + "\nTotal Value: $" + df.format(calculateTotalValue())
          + "\nTotal Use Tax: $" + df.format(calculateTotalUseTax())
          + "\n";
          
       return output;       
    }
    
    /** This method sorts through the array.
     * @return -- returns a String of the objects sorted.
     */
    public String listByOwner()
    {
       Arrays.sort(vehicleList);
       String output = "\n------------------------------"
          + "\nVehicles by Owner"
          + "\n------------------------------\n";
       for (int i = 0; i < vehicleList.length; i++)
       {
          output += "\n" + vehicleList[i] + "\n";   
       }
       return output;
    }
    
    /** This method sorts the objects by use tax.
     * @return -- returns a String of the objects sorted by the use tax.
     */
    public String listByUseTax()
    {
       Arrays.sort(vehicleList, new UseTaxComparator());
       String output = "\n------------------------------"
          + "\nVehicles by Use Tax"
          + "\n------------------------------\n";
       
       for (int i = 0; i < vehicleList.length; i++)
       {
          output += "\n" + vehicleList[i] + "\n";   
       }
       
       return output;
    }
    
    /**This method holds the output for the excluded records.
     * @return -- returns the output of excluded records objects.
     */
    public String excludedRecordsList()
    {
       String output = "\n------------------------------"
          + "\nExcluded Records"
          + "\n------------------------------\n";
          
       for (int i = 0; i < excludedRecords.length; i++)
       {
          output += "\n" + excludedRecords[i] + "\n";
       }
          
       return output;
    }   
 }