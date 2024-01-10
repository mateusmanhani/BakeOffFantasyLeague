
package bakeofffantasyleague;

/**
 *
 * @author Mateus Manhani
 */
public class Baker {
    private String bakerName;
    private int bakerPoints;


    public Baker (String bakerName){
        this.bakerName = bakerName;
        this.bakerPoints = 0;
    }  
    
    public String getBakerName(){
        return bakerName;
    }
    
    public int getBakerPoints(){
        return bakerPoints;
    }
    
    
}
