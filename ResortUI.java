import java.util.*; // imports all classes in the java.util.* package
/**
 * 
 * The class ResortUI runs the application for the user and takes input from the user. 
 * @H_R (HelithaRupasinghe 18001953) 
 * @v1(10/04/2020)
 */
// Creating class ResortUI
public class ResortUI
{
    //scanner class used to get input from the user
    private Scanner reader = new Scanner(System.in);
    private ResortManager wayward = new ResortManager("Wayward"); 
    
    //method to run UI 
    public void runUI()
    {   

        int choice = getOption();        
        while (choice != 0)
        {            
            // process choice
            if      (choice == 1){listAllWorlds();}
            else if (choice == 2){listAllCardsbyWorld();}
            else if (choice == 3){listOneWorld();}
            else if (choice == 4){findACard();}
            else if (choice == 5){tryTravel();}
            else if (choice == 6){travelNow();}
          //  else if (choice == 7){updateCredits();}
          //   else if (choice == 8){goHome();}
          // else if (choice == 9){convertPts();}
          // else if (choice == 10){evacuate();}
            // output menu & get choice
            choice = getOption();
        }
        System.out.println("\nThank-you");
    }
    
    
    private int getOption()
    {
       System.out.println("What would you like to do ?");
       System.out.println("0. Quit");
       System.out.println("1. List all world details");
       System.out.println("2. List all cards on each worlds");
       System.out.println("3. List all cards on one world");
       System.out.println("4. Find a card");
       System.out.println("5. Say if card can move by shuttle");
       System.out.println("6. Move a card by shuttle");
//        System.out.println("7. Top up credits");
//        System.out.println("8. Move a card to home world");
//        System.out.println("9. Convert points to credits - Business only");
//        System.out.println("10. Evacuate all");

       System.out.println("Enter your choice");
       // read choice
       int option = reader.nextInt();
       reader.nextLine();
       return option;
    }
    
    // This one has been done for you 
    private void listAllWorlds()
    { 
        //System.out.println("Enter name of world");
        World world1 = new World( 0, "Home" , 0 , 1000);
        World world2 = new World( 1, "Sprite" , 1 , 100 );
        World world3 = new World( 2, "Tropicana" , 3, 10 );
        World world4 = new World( 3 , "Fantasia" , 5 , 2 );
        World world5 = new World( 4 , "Solo" , 1 , 1 );
        System.out.println(world1.toString());
        System.out.println(world2.toString());
        System.out.println(world3.toString());
        System.out.println(world4.toString());
        System.out.println(world5.toString());
  
       
    }
    
    // provide the code here  
    private void listAllCardsbyWorld()
    {
        System.out.println("Enter name of world");
        String world = reader.nextLine();  
        System.out.println(wayward.getAllCardsOnEachWorld(world));
    }
   
    // This one has been done for you 
    private void listOneWorld()
    {
        System.out.println("Enter name of world");
        String ww = reader.nextLine();
        System.out.println(wayward.getAllCardsOnWorld(ww));
    }
    
    // provide the code here
    private void findACard()
    {
      System.out.println("Enter card ID ");
      int trav = reader.nextInt();
      reader.nextLine();
     System.out.println(wayward.getCard(trav));
     
    }
    
    // This one has been done for you 
    private void tryTravel()
    {
        System.out.println("Enter card id");
        int trav = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter shuttle code");
        String shuttle = reader.nextLine();
        System.out.println(wayward.canTravel(trav,shuttle));
    }
    
    // provide the code here
    private void travelNow()
    {   System.out.println("Enter card id");
        int trav = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter shuttle code");
        String shuttle = reader.nextLine();
        System.out.println(wayward.travel(trav,shuttle));
 
    }
    
//     // provide the code here if you have done Task 7
//   private void updateCredits()
//     {
       
        
//      }
//     
//     // provide the code here
//     private void goHome()
//     {
//     }
//     
      // provide the code here
//     private void convertPts()
//   {
       
//   }
//     
//     // provide the code here
//     private void evacuate()
//     {
//     }
    
    
}
