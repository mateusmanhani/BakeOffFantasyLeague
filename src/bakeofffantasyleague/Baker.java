
package bakeofffantasyleague;

/**
 *
 * @author Mateus Manhani
 */
public class Baker {
    private String bakerName;
    private int bakerPoints;


    public Baker (String contestantName){
        this.bakerName = contestantName;
        this.bakerPoints = 0;
    }  
    
    public String getBakerName(){
        return bakerName;
    }
    
    public int getBakerPoints(){
        return bakerPoints;
    }
    
}
