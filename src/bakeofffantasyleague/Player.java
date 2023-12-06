
package bakeofffantasyleague;

import java.util.ArrayList;
/**
 *
 * @author Mateus Manhani
 */
public class Player {
    private String name;
    private String teamName;
    private int totalPoints;
    private ArrayList<Contestant> predctionHistory;

    public Player(String name, String teamName){
        this.name = name;
        this.teamName = teamName;
        this.totalPoints = 0;
        this.predctionHistory = new ArrayList<>();
        
    }
    
    
}

