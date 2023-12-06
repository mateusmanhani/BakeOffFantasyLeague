
package bakeofffantasyleague;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class BakeOffFantasyLeague {

    public static void main(String[] args) {
        List<Player> playerRank = new ArrayList<>();
        List<Contestant> contestantRank = new ArrayList<>();
        
    }
    
    public static Player createNewPlayer(){
        String name = "";
        String teamName = "";
        
        Scanner sc = new Scanner(System.in);
        
        // Keep asking for input until the player gets it right
        while (true) {
            try {
                System.out.println("Please Enter your name:");
                name = sc.nextLine();

                System.out.println("Enter your Team Name:");
                teamName = sc.nextLine();
                // If all inputs are successful, break out of the loop
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine(); // Consume the invalid input to prevent an infinite loop
            }
        }
        Player newPlayer = new Player(name, teamName);
        
        return newPlayer;
    }
    
    public void getWeeklyPrediction(){
        
    }
}
