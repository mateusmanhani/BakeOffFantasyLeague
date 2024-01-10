
package bakeofffantasyleague;

import bakeofffantasyleague.Repositories.PlayerRepository;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Mateus Manhani
 */
public class Player {
    private final String playerName;
    private final String teamName;
    private int totalPoints;
    private ArrayList<Baker> predictionHistory;
    private ArrayList<Integer> scoreHistory;

    public Player(String name, String teamName){
        this.playerName = name;
        this.teamName = teamName;
        this.totalPoints = 0;
        this.predictionHistory = new ArrayList<>();
        this.scoreHistory = new ArrayList<>();
    }
    
    public String getName(){
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
    
    public void setPredictionHistory(ArrayList<Baker> predictionHistory){
        this.predictionHistory = predictionHistory;
    }

    CharSequence getTeamName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

