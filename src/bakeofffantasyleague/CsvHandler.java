package bakeofffantasyleague;

import java.io.*;
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

    // Other methods remain unchanged...

    private static String formatBaker(Baker baker) {
        return baker.getBakerName();
    }
}