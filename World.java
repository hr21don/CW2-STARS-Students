import java.util.ArrayList; // importing the ArrayList Package

/** 
   HR ( Helitha Rupasinghe 18001953)
   V1 ( 10/04/2020)
   
   Class world displays a network of worlds for a resort.   
   */
  
  //creating class world
public class World 
    {/** Fields of a class world*/
        //list<Boolean> boolList = arrayToList(boolArray, new Arraylist<>());
      private int world_number;
      private String worldname;
      private int worldrating;
      private int worldcapacity; 
      private ArrayList<Card> card;
      //constructor 
      public World(int id , String n , int wr , int wc)
      {
        world_number = id;
        this.worldname = n;
        this.worldrating = wr;
        this.worldcapacity = wc; 
        card = new ArrayList<Card>();
      } 
      
      /** Return WorldName */
      public String getWorldName(){
        return worldname;        
        } 
      public void setWorldName(String n)
       {
        this.worldname = n ;
        }
        
        /** Return WorldNumber */
      public int getWorldNumber(){
        return world_number;        
       }
      public void setworldNumber(int wn)
       {
        this.world_number = wn;
       }
        
        /** Return WorldRating */
      public int getWorldRating ( )
       {
       return worldrating ;
       }
      public void setWorldRating(int wr)
       {
        this.worldrating = wr;
       }
        
        /** Return WorldCapacity */
      public int getWorldCapacity ()
        {
          return worldcapacity;
        }
      public void setWorldCapacity(int wc)
        {
        this.worldcapacity = wc; 
       }
        
       //this method returns a string with all the relevant information stored in class world. 
      public String toString()
     {
       return world_number + "\n " + worldname + "\n" + worldrating + " \n " + worldcapacity + " \n" ;     
      } 
      
      //This method has card as a parameter and adding a card to the  ArrayList
      public void enter(Card c)
      {
        card.add(c);
        
      }
      //Deleting a card from the Arraylist
       public void leave(Card c)
      {
       for (int i = 0 ; i < card.size() ; i++)
       {
         if (card.get(i) == c)
         {
          card.remove(i);  
         }
        }
       }
       //An accessor which returns a boolean when the world is full 
       public boolean worldFull()
       {
        if (worldcapacity == card.size() )
        {
          return true; 
         }
         else 
         {
            return false; 
         }
       }
       //this method reports AllCardsonWorld
       public String ALLCardsonWorld()
       {
           String report_Cards = " ";
          for (int i = 0 ; i < card.size() ; i++)
       {
          report_Cards = report_Cards + card.get(i).toString();
        }
        return report_Cards; 
       }
       // this method reports Card_on_world  
       public boolean Card_On_World(Card c)
       {
         for (int i = 0 ; i < card.size() ; i++)
       {
         if (card.get(i) == c)
         {
           return true;
         }
        }
        return false; 
        }
       
    }
