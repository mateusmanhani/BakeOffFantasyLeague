
package bakeofffantasyleague;

/**
 *
 * @author Mateus Manhani
 */
public class Contestant {
    private String contestantName;
    private int totalPoints;


    public Contestant (String contestantName){
        this.contestantName = contestantName;
        this.totalPoints = 0;
    }  
    
    public String getContestantName(){
        return contestantName;
    }
    
    public int getContestantPoints(){
        return totalPoints;
    }
    
}
