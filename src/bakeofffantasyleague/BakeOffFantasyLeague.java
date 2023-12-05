
package bakeofffantasyleague;

import java.util.ArrayList;
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

                System.out.println("Now you will be asked for three contestants that will compose your team.");
                System.out.println("Please enter the first contestant:");
                contestant1 = sc.nextLine();

                System.out.println("Please enter the second contestant:");
                contestant2 = sc.nextLine();

                System.out.println("Please enter the third contestant:");
                contestant3 = sc.nextLine();

                // If all inputs are successful, break out of the loop
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine(); // Consume the invalid input to prevent an infinite loop
            }
        }
        Player newPlayer = new Player(name, teamName, contestant1, contestant2, contestant3);
        
        return newPlayer;
    }
    
    public void getWeeklyPrediction(){
        
    }
}
