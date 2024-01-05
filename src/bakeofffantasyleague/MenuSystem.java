package bakeofffantasyleague;

import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class MenuSystem {
    
    public static void showMenu(){
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        
        System.out.println("Please log in to continue.");
        System.out.println("Enter your Fanatsy League ID: ");
        
        String player = sc.nextLine();
        
        while (!exit){
            System.out.println("Main Menu: ");
            System.out.println("1. Make Predictions");
            System.out.println("2. View Results");
            System.out.println("3. View History ");
            System.out.println("4. View League Rank");
            System.out.println("5. Exit");
            System.out.println("Please Enter the number corresponding to the desired option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice){
                case 1:
                    Player.getWeeklyPredictions();
                    break;
                case 2:
                    // display bakers 
                    break;
                case 3:
                    //display player's history
                    break;
                case 4:
                    // Display Players
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Choice please try again");
            }
        }
        
    }
    
}
