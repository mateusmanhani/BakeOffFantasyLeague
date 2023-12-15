
package bakeofffantasyleague;

import java.util.ArrayList;
import java.util.Scanner;
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
    
    public static void getWeeklyPredictions(Player player, ArrayList<Baker> bakers){
        String bestBakerStr;
        String roundWinnerStr;
        String eliminatedBakerStr;
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please select best baker and type the name;  ");
        bestBakerStr = sc.nextLine();
        
        System.out.println("Now pick the winner of the technical round: ");
        roundWinnerStr = sc.nextLine();
        
        System.out.println("Lastly pick who you believe will be eliminated: ");
        eliminatedBakerStr = sc.nextLine();
        
        Baker bestBaker = findBakerByName(bestBakerStr, bakers);
        
        if(bestBaker != null){
            player.addPrediction(bestBaker);
            System.out.println("Prediction added Successfully.");
        }else{
            System.out.println("Baker not found.");
        }
        
        Baker roundWinner = findBakerByName(roundWinnerStr, bakers);
        
        if (roundWinner != null){
            player.addPrediction(roundWinner);
            System.out.println("Prediction adder successfully.");
        }else{
            System.out.println("Baker not found.");
        }
        
        Baker eliminatedBaker = findBakerByName(eliminatedBakerStr, bakers);
        if (eliminatedBaker != null){
            player.addPrediction(eliminatedBaker);
            System.out.println("Prediction added successfully.");
        }else{
            System.out.println("Baker not found.");
        }
    }
        
}

