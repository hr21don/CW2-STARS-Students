/**
 * Write a description of class CardTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 
public class CardTester
{      
    public static void main(String[] args)
    {
     //Test1 calling getCard_Id method to return the card_id  
        Card card1 = new Card( 1000 , "Lynn" , 5 , 10 );
     //Test 2 calling getName method to return the  name of the card.
        Card card2 = new Card( 1001 , "May" , 3 , 30 );
     // Test 3 calling getluxury_Rating method to return the  luxury_rating of the card. 
        Card card3 = new Card( 1002 , "Nils" , 10 , 25 );
     //Test 4 calling getNumber_of_Credits method to return the noc of the card. 
        Card card4 = new Card( 1003 , "Olek" , 2 , 12);
     
        System.out.println(card1.getCard_Id());
        System.out.println(card2.getName());
        System.out.println(card3.getluxury_Rating());
        System.out.println(card4.getNumber_of_Credits());
       // Calling upon setNumber_of_credits method
        System.out.println(card1.toString());
        card1.setNumber_of_credits(5); 
        System.out.println(card1.toString());
       // Calling upon setLuxury_Rating method
        System.out.println(card2.toString());
        card2.setLuxury_Rating(10);
        System.out.println(card2.toString());
        // Calling upon setName method
        System.out.println(card3.toString());
        card3.setName("Mary");
        System.out.println(card3.toString());
        // calling upon setcard_ID method 
        System.out.println(card4.toString());
        card4.setcard_ID(1004);
        System.out.println(card4.toString());
        
       
         
     }
}

    
  


   
 
