
package bakeofffantasyleague;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mateus Manhani
 */
public class BakeOffFantasyLeague {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
    public ArrayList<String> getPlayerInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter you name:");
        String name = sc.nextLine();
        
        System.out.println("Enter you Team Name");
        String teamName = sc.nextLine();
        
        System.out.println("Now you will be asked for three contestants that will compose your team.");
        System.out.println("Please enter the first contestant: ");
        String contestant1 = sc.nextLine();
        
        System.out.println("Please enter the second contestant: ");
        String contestant2 = sc.nextLine();
        
        System.out.println("Please enter the third contestant: ");
        String contestant3 = sc.nextLine();
    }
    
}
