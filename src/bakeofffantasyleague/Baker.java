
package bakeofffantasyleague;

/**
 *
 * @author Mateus Manhani
 */
public class Baker {
    private String bakerName;
    private int bakerPoints;


    public Baker (String bakerName, int bakerPoints){
        this.bakerName = bakerName;
        this.bakerPoints = bakerPoints;
    }  
    
    public String getBakerName(){
        return bakerName;
    }
    
    public int getBakerPoints(){
        return bakerPoints;
    }
    
    
}
