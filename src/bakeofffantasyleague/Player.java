
package bakeofffantasyleague;

import java.util.ArrayList;
/**
 *
 * @author Mateus Manhani
 */
public class Player {
    private String playerName;
    private String teamName;
    private int totalPoints;
    private ArrayList<Contestant> predctionHistory;

    public Player(String name, String teamName){
        this.playerName = name;
        this.teamName = teamName;
        this.totalPoints = 0;
        this.predctionHistory = new ArrayList<>();
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    public int getPlayerPoints(){
        return totalPoints;
    }
    
    
}

