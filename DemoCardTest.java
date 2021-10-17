
/**
 * Write a description of class DemoCardTest here.
 *
 * @author (Helitha Rupasinghe (18001953))
 * @version (a version number or a date)
 */
public class DemoCardTest
{
   public static void main(String[] args)
    {
     //Test1 calling getCard_Id method to return the card_id  
        Card cc1 = new Card( 666 , "Anna" , 4 , 10 );

       
      
       System.out.println("The number of credits for ANNA");
        System.out.println(cc1.getNumber_of_Credits());
        System.out.println("Before Deduction");
        System.out.println(cc1.toString());
        cc1.setNumber_of_credits(4);
        System.out.println("After Deduction");
        System.out.println(cc1.toString());
        
       
         
     }
}
