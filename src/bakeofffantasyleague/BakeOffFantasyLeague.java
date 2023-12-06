
package bakeofffantasyleague;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class BakeOffFantasyLeague {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Contestant> contestants = new ArrayList<>();
        
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
    
    public static ArrayList<Contestant> rankContestants(ArrayList<Contestant> contestants){
        // Use ArrayList.sort with a custom comparator
        contestants.sort(Comparator.comparingInt(Contestant::getContestantPoints).reversed());
        
        return contestants;
    }
    
    private static ArrayList<Player> rankPlayers(ArrayList<Player> players) {
        // Use ArrayList.sort with a custom comparator
        players.sort(Comparator.comparingInt(Player::getPlayerPoints).reversed());
        
        return players;
    }
    
    public static void getWeeklyPrediction(){
        
    }
}
