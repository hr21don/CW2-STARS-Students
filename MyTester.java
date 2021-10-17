import java.util.*; // Imports the Java.util package
/**
 * Write a description of class Tester here.
 * 
 * @HR (Helitha_Rupasinghe) 
 * @version1 (10/04/2020)
 */
public class MyTester 
{   
    
    
    public void doTest1()
    
    { 
        //Testing canTravel and Travel methods (bogus tests )
        
     ResortManager  Resort1 = new ResortManager("Resort1");
     
    
     System.out.println(Resort1.canTravel(1001, "ABC1")); 
     System.out.println(Resort1.canTravel(1002, "BCD2"));
     System.out.println(Resort1.canTravel(1002, "DEF44"));
     System.out.println(Resort1.travel(1002,"HIK7"));
     System.out.println(Resort1.travel(1003,"IKI8"));
     System.out.println(Resort1.travel(1004,"GH16"));
     System.out.println(Resort1.travel(1003,"ABC1"));
     }

     
    
}

