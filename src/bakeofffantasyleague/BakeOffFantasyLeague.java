
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
        ArrayList<Baker> bakers = new ArrayList<>();
    }
    
    private static void displayPlayers(ArrayList<Player> players) {
     // Display the players with their total points
     System.out.printf("%-10s %-15s\n", "Name", "Total Points");
     for (Player player : players) {
         System.out.printf("%-10s %-15d\n", player.getPlayerName(), player.getPlayerPoints());
     }
    }
    
    private static void displayBakers(ArrayList<Baker> bakers) {
     // Display the players with their total points
     System.out.printf("%-10s %-15s\n", "Name", "Total Points");
     for (Baker baker : bakers) {
         System.out.printf("%-10s %-15d\n", baker.getBakerName(), baker.getBakerPoints());
     }
    }    
    public static ArrayList<Baker> sortBakers(ArrayList<Baker> bakers){
        // Use ArrayList.sort with a custom comparator
        bakers.sort(Comparator.comparingInt(Baker::getBakerPoints).reversed());
        
        return bakers;
    }
}
