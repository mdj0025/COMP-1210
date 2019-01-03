import javax.swing.JOptionPane;
/** This program holds the main method for the division methods.
 *
 * Activity 11
 * Michael Johnson Comp1210 Section 003
 * 12-04-17
 */
public class DivisionDriver
{
	/** This is the main method for the activity.
    * @param args -- not used.
    */
   public static void main(String[]	args)
	{
		String numIn	= JOptionPane.showInputDialog("Enter the numerator");	
      String denomIn = JOptionPane.showInputDialog("Enter the denominator");
		try {
		   int num =	Integer.parseInt(numIn);
			int denom	= Integer.parseInt(denomIn);
		  
			String result =	"Integer division: \n"
					       + Division.intDivide(num, denom)
							 + "\n\nFloating point division: \n"
							 + Division.decimalDivide(num,	denom);
							
							
		  
			JOptionPane.showMessageDialog(null, result, 
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
			  
			  
		catch (NumberFormatException e)
		{
		   JOptionPane.showMessageDialog(null, 
            "Invalid input: enter numerical integer values only.",	
               "Error",	JOptionPane.ERROR_MESSAGE);
		}
        
      catch (IllegalArgumentException e)
      {
         JOptionPane.showMessageDialog(null, e, 
            "Error", JOptionPane.ERROR_MESSAGE);
      }		  
	}	  
	
}