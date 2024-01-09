package bakeofffantasyleague;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvHandler {
    private static final String PLAYERS_CSV_FILE_PATH = "players.csv";
    private static final int PREDICTION_COLUMNS = 3;

    public static void writePlayersToCsv(Map<String, Player> playersMap) {
        try (FileWriter writer = new FileWriter(PLAYERS_CSV_FILE_PATH)) {
            // Write header
            writer.append("PlayerName,TeamName,TotalPoints");
            for (int i = 1; i <= PREDICTION_COLUMNS; i++) {
                writer.append(",BestBaker").append(String.valueOf(i))
                        .append(",RoundWinner").append(String.valueOf(i))
                        .append(",EliminatedBaker").append(String.valueOf(i));
            }
            writer.append("\n");

            // Write player data
            for (Map.Entry<String, Player> entry : playersMap.entrySet()) {
                Player player = entry.getValue();
                writer.append(player.getName())
                        .append(",")
                        .append(player.getTeamName())
                        .append(",")
                        .append(String.valueOf(player.getPlayerPoints()));

                List<Baker> predictionHistory = player.getPredictionHistory();
                for (Baker baker : predictionHistory) {
                    writer.append(",")
                            .append(formatBaker(baker));
                }
                writer.append("\n");
            }

            System.out.println("Players data written to " + PLAYERS_CSV_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static Map<String, Player> readPlayersFromCsv() {
        Map<String, Player> playersMap = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(PLAYERS_CSV_FILE_PATH))) {
            // Read header (skip it for now)
            reader.readLine();

            // Read player data
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                String playerName = values[0];
                String teamName = values[1];
                int totalPoints = Integer.parseInt(values[2]);

                Player player = new Player(playerName, teamName);
                player.updatePoints(totalPoints);
                
                // Create new List in order to save all the predctions from the CSV file
                ArrayList<Baker> predictionHistory = new ArrayList<>();
                for (int i = 3; i < values.length; i++) {
                    predictionHistory.add(new Baker(values[i]));
                }

                player.setPredictionHistory(predictionHistory);
                playersMap.put(playerName, player);
            }

            System.out.println("Players data read from " + PLAYERS_CSV_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return playersMap;
    }

    private static String formatBaker(Baker baker) {
        return baker.getBakerName();
    }
}