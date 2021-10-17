/**
 HR (HelithaRupasinghe 18001953)
 V1  ( 10/04/2020)
 
 This class is used to move around the resort using shuttles. 
 */
    //creating class Card
     public class Card {
        /** Fields of a card*/ 
       private int  card_id;
       private String name;
       private int luxury_rating; 
       private int number_of_credits;
       private int number_of_loyalty_pts;
      
       /** constructor for objects of class card*/
    public Card(int c_id , String n , int lr , int noc  )
     {
         
     card_id = c_id;
     this.name = n;
     this.luxury_rating = lr;
     this.number_of_credits = noc;
     this.number_of_loyalty_pts = 0;     
     }
     
     /** Return card_id*/
   public int getCard_Id ()
        {
        return card_id;        
        }
   public void setcard_ID( int c_id)
        {           
        this.card_id = c_id; 
        }
        /** Return name*/
   public String getName()
        {
        return name;
        }
   public void setName(String n)
        {
        this.name = n;
        }
        /** Return lr*/
   public int getluxury_Rating ( )
        {
         return luxury_rating;
        }
   public void setLuxury_Rating( int lr)
        {
        this.luxury_rating  = lr; 
        }
      
        /** Return noc*/
   public int getNumber_of_Credits ()
        {
        return number_of_credits;
        }
   public void setNumber_of_credits(int noc)
        {
        this.number_of_credits = noc;
        }
        
        /** Return lps*/
   public int getNumber_of_loyalty_Pts ( )
        {
        return number_of_loyalty_pts;
        }
   public void setNumber_of_loyalty_Pts(int lps)
       {
        this.number_of_loyalty_pts = lps;           
        }
        
        //First Conversion: Loyalty Points to Credits 
   public void number_of_loyalty_Points()
        {                
         
            number_of_credits += number_of_loyalty_pts / 4;  
            number_of_loyalty_pts = 0;  
        }
       //this method returns a string with all the relevant information stored in Card Class. 
   public String toString()
        {
          return card_id + " \n  " + name + " \n "+ luxury_rating + " \n "+ number_of_credits + " \n " + number_of_loyalty_pts + " \n ";
            
        }        
        
    }
