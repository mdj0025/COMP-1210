 import java.util.Scanner;
 import java.io.FileNotFoundException;
 import java.util.ArrayList;
 
 /** This class holds a main method for evaluating user input.
  * 
  * Project 06
  * Michael Johnson Comp1210 Section 003
  * 10-19-17
  */
 public class SpherocylinderListMenuApp
 {
 
    /** This main method holds cases for evaluating user input.
     * @param args -- not used
     * @throws FileNotFoundException if the file cannot be opened.
     */
    public static void main(String[] args) throws FileNotFoundException
    {
       String listName = "";
       ArrayList<Spherocylinder> myList = new ArrayList<Spherocylinder>();
       SpherocylinderList mySList = new SpherocylinderList(listName, myList);
       String fileName = "";         
       String label;
       double radius, cylinderHeight;        
       String code = "";      
       Scanner scan = new Scanner(System.in);      
       System.out.println("Spherocylinder List System Menu\n"
                        + "R - Read File and Create Spherocylinder List\n"
                        + "P - Print Spherocylinder List\n"
                        + "S - Print Summary\n"
                        + "A - Add Spherocylinder\n"
                        + "D - Delete Spherocylinder\n"
                        + "F - Find Spherocylinder\n"
                        + "E - Edit Spherocylinder\n"
                        + "Q - Quit");         
       do
       {
          System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
          code = scan.nextLine();
          code = code.toUpperCase();
          if (code.length() == 0)
          {
             continue;
          }        
          char codeChar = code.charAt(0);
          
          switch(codeChar)
          {
             case 'R':
                System.out.print("\tFile name: ");
                fileName = scan.nextLine();
                
                mySList = mySList.readFile(fileName);
                
                System.out.println("\tFile read in and "
                   + "Spherocylinder List created");
                   
                System.out.println("");
                
                break;
                
             case 'P':
                System.out.println("\n" + mySList);
                
                break;
                
             case 'S':
                
                System.out.println("\n" + mySList.summaryInfo());
                
                System.out.println("");
                
                break;
                
             case 'A':
                System.out.print("\tLabel: ");
                label = scan.nextLine();
                
                System.out.print("\tRadius: ");
                radius = Double.parseDouble(scan.nextLine());
                
                System.out.print("\tCylinder Height: ");
                cylinderHeight = Double.parseDouble(scan.nextLine());
                
                mySList.addSpherocylinder(label, radius, cylinderHeight);
                System.out.println("\t*** Spherocylinder added ***");
                
                System.out.println("");
                
                
                break;
                
                            
             case 'D':
                System.out.print("\tLabel: ");
                String label3 = scan.nextLine();
                
                
                
                if (mySList.deleteSpherocylinder(label3) != null)
                {
                      
                   System.out.println("\t\"" + label3 + "\" deleted\n");
                }
                
                else
                {
                   System.out.println("\t\"" + label3 + "\" not found\n");
                }
                                
                break;
                
             case 'F':
                System.out.print("\tLabel: ");
                label = scan.nextLine();
                Spherocylinder sphero21;
                
                
                if (mySList.findSpherocylinder(label) != null)
                {
                   sphero21 = mySList.findSpherocylinder(label);
                   System.out.println(sphero21 + "\n");
                   
                }
                
                else
                {
                   System.out.println("\t\"" + label + "\" not found\n");
                }
                
                break;
                
             case 'E':
                System.out.print("\tLabel: ");
                label = scan.nextLine();
                
                System.out.print("\tRadius: ");
                radius = Double.parseDouble(scan.nextLine());
                
                System.out.print("\tCylinder Height: ");
                cylinderHeight = Double.parseDouble(scan.nextLine());
                
                if (mySList.editSpherocylinder(label,
                   radius, cylinderHeight)) 
                {
                   System.out.println("\t\"" + label 
                      + "\" successfully edited\n");
                }
                
                else 
                {
                   System.out.println("\t\"" + label + "\" not found\n");
                }
                break;
                
             case 'Q':
                break;
          
             
             
             default:
                System.out.println("\t*** invalid code ***\n");
                break;               
          } 
       
       } while (!code.equalsIgnoreCase("Q"));   
    }
 
 }