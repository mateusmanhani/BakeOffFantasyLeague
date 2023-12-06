
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
    
    
    public class Contestant{
        String contestantName;
        int constestantRank;
        
        public Contestant (String contestantName){
            this.contestantName = contestantName;
        }
    }
    public Player(String name, String teamName){
        this.name = name;
        this.teamName = teamName;
        this.totalPoints = 0;
        this.predctionHistory = new ArrayList<>();
        
    }
    
    
}

