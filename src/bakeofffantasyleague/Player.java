
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
    private ArrayList<Baker> predictionHistory;

    public Player(String name, String teamName){
        this.playerName = name;
        this.teamName = teamName;
        this.totalPoints = 0;
        this.predictionHistory = new ArrayList<>();
        // Three predictions per week: Best Baker, Technical Round Winner, Eliminated Baker
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    public int getPlayerPoints(){
        return totalPoints;
    }
    
    public void updatePoints(int points){
        this.totalPoints += points;
    }
    
    public void addPrediction(Baker contestant){
        predictionHistory.add(contestant);
    }
    
    public ArrayList<Baker> getPredictionHistory(){
        return predictionHistory;
    }
    
    private static Baker findBakerByName(String name, ArrayList<Baker> bakers){
        for (Baker baker : bakers){
            if(baker.getBakerName().equalsIgnoreCase(name)) return baker;
        }
        return null;
    }
    
    public static void getWeeklyPredictions(){
    
    }
        
}

