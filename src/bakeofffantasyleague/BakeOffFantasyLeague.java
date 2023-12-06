
package bakeofffantasyleague;


import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class BakeOffFantasyLeague {

    public static void main(String[] args) {
        
        
    }
    
    public Player createNewPlayer(){
        String name = "";
        String teamName = "";
        String contestant1 = "";
        String contestant2 = "";
        String contestant3 = "";
        
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
