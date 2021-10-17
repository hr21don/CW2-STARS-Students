/** 
   HR ( Helitha Rupasinghe 18001953 )
   V1 ( 10/04/2020)
   
   The class Shuttle connects two worlds at the resort.   
   
   */
 
  //creating class Shuttle
public class shuttle 
     {  
         // fields for class Shuttle
         private String journey_code;
         private World SourceWorld;
         private World  DestinationWorld ;
         
         //constructor
         public shuttle ( String j_c , World S_W , World D_W)
         {
            journey_code = j_c;
            this.SourceWorld = S_W;
            this.DestinationWorld = D_W; 
                 
         }
         
             //Return Journey_code
         public String getJourney_code()
         {
            return journey_code;
         }
         public void setJourney_code( String j_c)
         {
           this.journey_code = j_c;  
         }
           // Return SourceWorld
         public World getSource_World()
         {
           return SourceWorld;   
         }
         public void setSource_World(World S_W)
         {
             
           this.SourceWorld = S_W;
           
         }
            //Return DestinationWorld
         public World getDestination_World()
         {
           return DestinationWorld;   
         }
         public void  setDestination_World(World D_W)
         {
          this.DestinationWorld = D_W;   
          }
               //This method returns all the relevant information stored in Class Shuttle. 
         public String toString()
         {
             return journey_code + "\n " + SourceWorld.toString()+ "\n" + DestinationWorld.toString() + " \n " ;     
         }            
          //Card passed can travel on the shuttle 
         public boolean Can_Travel(Card c)
         {
          if (c.getNumber_of_Credits() >= 3)
          
          {
              
            if (!DestinationWorld.worldFull())
           
            {
              
              if (SourceWorld.Card_On_World(c))
              
              {
                  
                if(c.getluxury_Rating() >= DestinationWorld.getWorldRating())
               
                {
                     
                    return true;
                }
            }
            }
          }
            return false;    
            
            
         }
         
         public String Travel(Card c)
         {
         if (Can_Travel(c))
         {  
            SourceWorld.leave(c);
            DestinationWorld.enter(c);
            return ("Successfull");
         }
         else
         {
           return ("Not Successfull");
         }
          }
     }