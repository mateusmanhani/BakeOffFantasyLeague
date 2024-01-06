package bakeofffantasyleague;

import bakeofffantasyleague.Repositories.BakerRepository;
import bakeofffantasyleague.Repositories.PlayerRepository;
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
        
        String playerId = sc.nextLine();
        Player currentPlayer = findPlayerById(playerId);
        
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
                    // Take players predctions
                    PlayerRepository.getWeeklyPredictions(currentPlayer);
                    break;
                case 2:
                    // display bakers 
                    BakerRepository.displayBakers();
                    break;
                case 3:
                    //display player's history
                    PlayerRepository.displayPredictionHistory(currentPlayer);
                    break;
                case 4:
                    // Display Players
                    PlayerRepository.displayPlayers();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Choice please try again");
            }
        }
        
    }
    
    private static Player findPlayerById(String playerId){
        return PlayerRepository.getPlayers().get(playerId);
    }
    
}