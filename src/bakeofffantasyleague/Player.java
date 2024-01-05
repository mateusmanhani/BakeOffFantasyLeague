
package bakeofffantasyleague;

import bakeofffantasyleague.Repositories.BakerRepository;
import bakeofffantasyleague.Repositories.PlayerRepository;
import java.util.ArrayList;
import java.util.Comparator;
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
    
    public static void createNewPlayer(){
    String name = "";
    String teamName = "";

    Scanner sc = new Scanner(System.in);

    // Keep asking for input until the player gets it right
    while (true) {
        try {
            System.out.println("Please Enter your name:");
            name = sc.nextLine();

            System.out.println("Enter your Team Name:");
            teamName = sc.nextLine();
            // If all inputs are successful, break out of the loop
            break;
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            sc.nextLine(); // Consume the invalid input to prevent an infinite loop
        }
    }
    // Instanciate new player
    Player newPlayer = new Player(name, teamName);
    // Add new player to list
    PlayerRepository.addPlayer(newPlayer);
    }        
    
    public void addPrediction(Baker contestant){
        predictionHistory.add(contestant);
    }
    
    public ArrayList<Baker> getPredictionHistory(){
        return predictionHistory;
    }
    
    public static void getWeeklyPredictions(Player player){
        String bestBakerStr;
        String roundWinnerStr;
        String eliminatedBakerStr;
        
        BakerRepository.displayBakers();
        
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please select best baker and type the name;  ");
        bestBakerStr = sc.nextLine();
        
        System.out.println("Now pick the winner of the technical round: ");
        roundWinnerStr = sc.nextLine();
        
        System.out.println("Lastly pick who you believe will be eliminated: ");
        eliminatedBakerStr = sc.nextLine();
        
        Baker bestBaker = BakerRepository.getBakersMap().get(bestBakerStr);
        
        if(bestBaker != null){
            player.addPrediction(bestBaker);
            System.out.println("Prediction added Successfully.");
        }else{
            System.out.println("Baker not found.");
        }
        
        Baker roundWinner = BakerRepository.getBakersMap().get(roundWinnerStr);
        
        if (roundWinner != null){
            player.addPrediction(roundWinner);
            System.out.println("Prediction adder successfully.");
        }else{
            System.out.println("Baker not found.");
        }
        
        Baker eliminatedBaker = BakerRepository.getBakersMap().get(eliminatedBakerStr);
        if (eliminatedBaker != null){
            player.addPrediction(eliminatedBaker);
            System.out.println("Prediction added successfully.");
        }else{
            System.out.println("Baker not found.");
        }
    }
    
    public void displayPredictionHistory(){
        //Display Prediction history of a player as a table. Still missing the last column which will be the players points per week and the total points
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Week", "Best Baker" , "Round Winner" , "Eliminated Baker");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < predictionHistory.size(); i+=3){
            int weekNumber = (i/3)+1;
            Baker bestBaker = predictionHistory.get(i);
            Baker roundWinner = predictionHistory.get(i+1);
            Baker eliminatedBaker = predictionHistory.get(i+2);
            
            System.out.printf("%-20s %-20s %-20s %-20s\n", weekNumber, bestBaker.getBakerName(), roundWinner.getBakerName(), eliminatedBaker.getBakerName()); 
        }
    }
        
}

