/** This class contains methods for bank loans.
 *
 * Activity 08A
 * Michael Johnson Comp1210 Section 003
 * 10-30-17
 */

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   
   /** This method takes in two parameters and renames variables.
    * @param customerNameIn -- renames customerName
    * @param interestRateIn -- renames interestRate
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
      
   }
   
   /** This method takes in a parameter and lets the user borrow money.
    * @param amount -- holds the ammount of money borrowed.
    * @return -- returns a boolean value.
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /** This method allows the user to pay the bank.
    * @param amountPaid -- holds the amound paid by the user.
    * @return -- returns the new balance after the user pays the bank.
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /** This is an accessor method for the balance.
    * @return -- returns the current balance.
    */
   public  double getBalance() {
      return balance;
   }
   
   /** This method sets the interest rate.
    * @param interestRateIn -- holds the interest rate entered by user.
    * @return returns a boolean value if the interest rate entered is valid.
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /** This is an accessor method for the interest rate.
    * @return -- returns the user's interest rate.
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /** This method calculates the interest to be charged.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /** This method holds the classes toString method.
    * @return -- returns the output.
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /** This method determines is the ammount is valid.
    * @param amount -- holds the amount of money.
    * @return -- returns a boolean condition.
    */
   public static boolean isAmountValid(double amount)
   {
      boolean status = false;
      
      if (amount >= 0)
      {
         status = true;
      }
      
      return status; 
   }

   /** This method determines if the user is in debt.
    * @param loan -- Holds a BankLoan object.
    * @return -- returns a boolean condition.
    */
   public static boolean isInDebt(BankLoan loan)
   {
      boolean result = false;

      if (loan.getBalance() > 0)
      {
         result = true;
      }
     
      
      return result;
   }
   
   /** This is an accessor method for the loans created in the program.
    * @return -- returns an int of the loans created.
    */
   public static int getLoansCreated()
   {
      return loansCreated;
   }
   
   /**This method resets the ammount of loans created.
    */
   public static void resetLoansCreated()
   {
      loansCreated = 0;
   }
   
   
}
