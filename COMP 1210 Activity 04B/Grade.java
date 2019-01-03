/**
 * This program initalizes variables for use in GradeGenerator.
 * 
 * Activity 04B
 * Michael Johnson Comp1210 Section 003
 * 10-01-17
 */
public class Grade
{
   private double exam1 = 0;
   private double exam2 = 0;
   private double finalExam = 0;
   private double activityAvg = 0;
   private double quizAvg = 0;
   private double projectAvg = 0;
   private String studentName = "";
   
   /** Constant variables. 
    */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15, FINAL_WEIGHT = 0.30,
      ACT_WEIGHT = 0.05, QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
      
  /** This method renames the variable studentName.
   * @param studentNameIn -- renames studentName
   */    
   public Grade(String studentNameIn)
   {
      studentName = studentNameIn;
   
   }
   
   /** This  mutator method renames two variables.
    * @param activityAvgIn -- renames activityAvg
    * @param quizAvgIn -- renames quizAvg
    */
   
   public void setLabAverages(double activityAvgIn, double quizAvgIn)
   {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;    
   
   }
   
   /** This mutator method renames projectAvgIn.
    * @param projectAvgIn -- renames projectAvg
    */
   public void setProjectAvg(double projectAvgIn)
   {
      projectAvg = projectAvgIn;   
   
   }
   
   /** This mutator method takes in parameters to decide on exam type.
    * @param examType -- decides which exam is being used
    * @param examScoreIn -- takes in a value for the exam score
    */
   public void setExamScore(int examType, double examScoreIn)
   {
      if (examType == EXAM_1)
      {
         exam1 = examScoreIn;
      }
      
      else if (examType == EXAM_2)
      {
         exam2 = examScoreIn;
      }
      
      else if (examType == FINAL)
      {
         finalExam = examScoreIn;
      }
   }
   
   /** This method calculates the Grade.
    * @return -- returns grade value
    */
   public double calculateGrade()
   {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      return grade;
   
   }
   
   /** This toString method uses values calculated in the program.
    * @return -- returns the string
    */
   public String toString()
   {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
   }
   


}