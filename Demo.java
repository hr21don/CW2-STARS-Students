import java.util.*; // imports the java.util packag
/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo
{

    public void doTest1()
    
    { 
        //Testing canTravel and Travel methods (bogus tests )
        
     ResortManager  planet = new ResortManager("Jupiter");
     

      
      
     System.out.println(planet.canTravel(1008, "ABC1")); 
     System.out.println(planet.canTravel(1008, "CDE3"));
     System.out.println(planet.canTravel(1005, "ABC1"));
      

     System.out.println(planet.travel(1001,"GHJ6"));
    System.out.println(planet.travel(1003,"CDE3"));
  
     }

     
}
