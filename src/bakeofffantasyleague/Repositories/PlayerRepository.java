/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bakeofffantasyleague.Repositories;

import bakeofffantasyleague.Player;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mateus Manhani
 */
public class PlayerRepository {
    public static Map<String, Player> playersMap = new HashMap<>();
    
        // Players Operations
    public static void addPlayer(Player newPlayer) {
        playersMap.put(newPlayer.getName(), newPlayer);
    }
    
    public static Map<String,Player> getPlayers() {
        return playersMap;
    }
   
    public static void displayPlayers() {
        for (Map.Entry<String, Player> entry : playersMap.entrySet()) {
            String playerName = entry.getKey();
            Player player = entry.getValue();
            int playerPoints = player.getPlayerPoints();
            
            System.out.println("Player: " + playerName + ", Points: " + playerPoints);
        }
    }
}
