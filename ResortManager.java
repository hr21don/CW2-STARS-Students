import java.util.*; // imports the java.util package 

/** 
   
   
   HR ( Helitha_Rupasinghe 18001953)
   V1 ( 10/04/2020)
   
   The class ResortManager provides all the basic functionality 
   
   */

//creating class ResortManager
public class ResortManager 
{
   //ResortManager Fields 
    private ArrayList<Card> cards;
    private ArrayList<World> worlds;
    private ArrayList<shuttle> shuttle;
    private String Name;
    
    //constructor
    public ResortManager(String N)
    {
    cards = new ArrayList<Card>();
    worlds = new ArrayList<World>();
    shuttle = new ArrayList<shuttle>();
    this.Name = N; 
    loadCards();
    loadWorlds();
    setUpShuttles();
    for (int i = 0  ; i < cards.size() ; i++ )
    {
     worlds.get(0).enter(cards.get(i));
    }
    for (int i = 0  ; i < worlds.size() ; i++ )
    {
     worlds.get(0).enter(cards.get(i));
    }
   }
    
    
    /**
     * Returns all of the data about all worlds including the cards
     * currently on each world, r "No cards"
     * @return all of the details of all worlds including  
     * and all cards currently on each world, or "No cards" 
     */
    public String toString()
    {
      return "" ;   
    }

    /**Returns a String representation of all the cards on all worlds, listed 
     * by world 
     * @return a String representation of all cards on all worlds
     **/
    public String getAllCardsOnEachWorld( String world)
    {
        return "" ;
    }
    
    
    /**Returns the name of the world which contains the specified card or null
     * @param cr - the specified card
     * @return the name of the World which contains the card, or null
     **/
    public String findCard(int cr)
    {
        return "";
    }
    
    
    /** Given the name of a world, returns the world id number
     * or -1 if world does not exist
     * @param name of world
     * @return id number of world
     */
    public int getWorldNumber(String ww)
    {
        return 0;
    }
    
                
    /**Returns a String representation of all the cards on specified world
     * @return a String representation of all cards on specified world
     **/
    public String getAllCardsOnWorld(String ww)
    {
       
        return ww + "";
    }
    
     /**Returns true if a Card is allowed to move using the shuttle, false otherwise
     * A move can be made if:  
     * the rating of the card  >= the rating of the destination world
     * AND the destination world is not full
     * AND the card has sufficient credits
     * AND the card is currently in the source world
     * AND the card id is for a card on the system
     * AND the shuttle code is the code for a shuttle on the system
     * @param crId is the id of the card requesting the move
     * @param shtlCode is the code of the shuttle journey by which the card wants to pCardel
     * @return true if the card is allowed on the shuttle journey, false otherwise 
     **/
    public boolean canTravel(int crId, String shtlCode)
    {
        shuttle s = getShuttle(shtlCode);
        Card c = getCard(crId);
        return s.Can_Travel(c);
        
      
    }
    

    /**Returns the result of a card requesting to move by Shuttle.
     * A move will be successful if:  
     * the luxury rating of the card  >= the luxury rating of the destination world
     * AND the destination world is not full
     * AND the card has sufficient credits
     * AND the card is currently in the source world
     * AND the card id is for a card on the system
     * AND the shuttle code is the code for a shuttle on the system
     * If the shuttle journey can be made, the card information is removed from the source
     * world, added to the destination world and a suitable message returned.
     * If shuttle journey cannot be made, the state of the system remains unchanged
     * and a message specifying the reason is returned.
     * @param pCardId is the id of the card requesting the move
     * @param shtlCode is the code of the shuttle journey by which the card wants to pCardel
     * @return a String giving the result of the request 
     **/
    public String travel(int pCardId, String shtlCode )
    {
        shuttle s = getShuttle(shtlCode);
        Card c = getCard(pCardId);
        return s.Travel(c);
    }
    
     
    // These methods are for Task 6 only and not required for the Demonstration 
    // If you choose to implement them, uncomment the following code    
    // /** Allows a card to top up their credits.This method is not concerned with 
     // *  the cost of a credit as currency and prices may vary between resorts.
     // *  @param id the id of the card toping up their credits
     // *  @param creds the number of credits purchased to be added to cards information
     // */
    // public void topUpCredits(int id, int creds)
    // {
        
        
    // }
    
    // /** Moves a card directly back to the home world without affecting credits
     // *  and not using existing shuttles
     // */
    // public void moveHome(int id)
    // {
    // }
  
    // /** Converts a card's loyalty points into credits
     // * @param tr the id of the card whose points are to be converted
     // */
    // public void convertPoints(int id)
    // {
    
    // }
    
    // /** In an emergency, evacuates all cards directly back to the home world without 
     // * affecting credits or other information and not using existing shuttles
     // */
    // public void evacuateAll()
    // {
    // }
    
   
    
    
    //***************private methods**************
    // create all cards in Appendix A and addthem to their collection
    private void loadCards()
    {
      cards.add(new Card( 1000 , "Lynn" , 5 , 10 ));
      cards.add(new Card( 1001 , "May" , 3 , 30 ));
      cards.add(new Card( 1002 , "Nils" , 10 , 25 ));
      cards.add(new Card( 1003 , "Olek" , 2 , 12 ));
      cards.add(new Card( 1004 , "Pan" , 3 , 3 ));
      cards.add(new Card( 1005 , "Quin" , 1 , 30 ));
      cards.add(new Card( 1006 , "Raj" , 10 , 6));
      cards.add(new Card( 1007 ,  "Sol" , 7 , 20 ));
      cards.add(new Card( 1008 , "Tel" , 6 , 30 ));
      cards.add(new Card( 8765 , "Tom" , 5 , 8 ));
    }
    
    // create all worlds in Appendix A and addthem to their collection
    private void loadWorlds()
    {
     worlds.add(new World( 0, "Home" , 0 , 1000));
     worlds.add(new World( 1, "Sprite" , 1 , 100 ));
     worlds.add(new World( 2, "Tropicana" , 3, 10 ));
     worlds.add(new World( 3 , "Fantasia" , 5 , 2 ));
     worlds.add(new World( 4 , "Solo" , 1 , 1 ));
     worlds.add(new World( 5 , "Cola" , 6 , 10 ));
     
     
    }
    
    // create all shuttles in Appendix A and addthem to their collection
    private void setUpShuttles()
    {
      shuttle.add( new shuttle ("ABC1",worlds.get(0)  , worlds.get(1)));
      shuttle.add( new shuttle ("BCD2", worlds.get(1)  , worlds.get(0)));
      shuttle.add( new shuttle ("CDF3", worlds.get(1)  , worlds.get(2)));
      shuttle.add( new shuttle ("DEF44",worlds.get(2)  , worlds.get(1)));
      shuttle.add( new shuttle ("IKI8", worlds.get(2)  , worlds.get(3)));
      shuttle.add( new shuttle ("FFG5", worlds.get(3)  , worlds.get(1)));
      shuttle.add( new shuttle ("GH16", worlds.get(1)  , worlds.get(4)));
      shuttle.add( new shuttle ("ZZZ", worlds.get(5)  , worlds.get(2)));
      shuttle.add( new shuttle ("YYY", worlds.get(3)  , worlds.get(5)));
    }
    
    
//  // Uncomment if you want to use.
//     /** Returns the card with the card id specified by the parameter
//      * @return the card with the specified name
//      **/
      public Card getCard(int id)
     {
         for (int i = 0 ; i < cards.size() ; i++)
         {
            if (cards.get(i).getCard_Id() == id)
            {
            return cards.get(i);
            }
           }
         return null;
     }
     
//     /** Returns the world with the name specified by the parameter
//      * @return the world with the specified name
//      **/
     private World getWorld(String worldName)
     {
          for (int i = 0 ; i < worlds.size() ; i++)
         {
            if (worlds.get(i).getWorldName() == worldName)
            {
               
              return worlds.get(i);
            }
           }
         return null;
         
     }
//     
//     /** Returns the world with the name specified by the parameter
//      * @return the world with the specified name
//      **/
     private shuttle getShuttle(String shut)
     { for (int i = 0 ; i < shuttle.size() ; i++)
         {
            if (shuttle.get(i).getJourney_code().equals(shut))
            {
            return shuttle.get(i);
            }
           }
         return null;
        }
    }