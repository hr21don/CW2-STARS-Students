
/**
 * Write a description of class Challenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Challenge
{
    // instance variables - replace the example below with your own
    
   /** Fields of a Group*/ 
       private int  Challenge_No;
       private String method;
       private int distance; 
       private int doneBy;
       private boolean available;
  
    /**
     * Constructor for objects of class Challenge
     */
    public Challenge(int c_No , int d , String MD , boolean available )
    {
        // initialise instance variables
        Challenge_No = c_No;
        this.distance = d;
        this.method = "Walk";
        this.doneBy = 0; 
        this.available = true; 
        
    }

      
      
    public int addDone()
    {
        int y = 0; 
        // put your code here
        return doneBy + y;
    }
    public int getDistance()
    {
        double meter , km , cm ;
       cm = 1000;
        // put your code here
       
        km = cm/ 100000.0 ; 
        
     
       return distance + km; 
    }
    public String toString()
    {
    
    return Challenge_No + "" + distance + "" + method + "" + doneBy + "" + available + ""; 
    }
}
