import java.io.FileNotFoundException;
/** This method holds the main method for the project.
 *
 * Project 11
 * Michael Johnson Comp 1210 Section 003
 * 12-08-17
 */
public class VehiclesPart3
{
   /** This is the main method for the project.
    *
    * @param args -- used in the command line arguments.
    */
   public static void main(String[] args) 
   {
      try
      {
         if (args.length > 0)
         {
            String fileName = args[0];
            UseTaxList vList = new UseTaxList();
            vList.readVehicleFile(fileName);
            System.out.println(vList.summary());
            System.out.println("\n" + vList.listByOwner());
            System.out.println("\n" + vList.listByUseTax());
            System.out.println("\n" + vList.excludedRecordsList()); 
         }
         
         else
         {
            System.out.println(
               "*** File name not provided by command line argument."
               + "\nProgram ending.");
         }
         
         
      }
      
      catch (FileNotFoundException e)
      {
         System.out.println("*** File not found.\nProgram ending.");
      }
   }
}