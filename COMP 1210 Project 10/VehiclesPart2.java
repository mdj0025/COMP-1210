import java.io.FileNotFoundException;

/** This program is the VehiclesPart2 class with a main method.
 *
 * Project 10
 * Michael Johnson Comp1210 Section 003
 * 12-01-17
 */
public class VehiclesPart2
{
  /** This is the main method for the project.
   * @param args -- command line arguments.
   * @throws FileNotFoundException is file is not found.
   */
   public static void main(String[] args) throws FileNotFoundException
   {
      String fileName = args[0];
      
      UseTaxList taxListObject = new UseTaxList();
      
      taxListObject.readVehicleFile("vehicles1.txt");
      
      System.out.println(taxListObject.summary());
      System.out.println(taxListObject.listByOwner());
      System.out.println(taxListObject.listByUseTax());
      System.out.println(taxListObject.excludedRecordsList());
      
      
      
       
   }
}