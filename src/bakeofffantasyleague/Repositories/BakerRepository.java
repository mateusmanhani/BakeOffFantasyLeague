package bakeofffantasyleague.Repositories;
/**
 *
 * @author Mateus Manhani
 */

import bakeofffantasyleague.Baker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BakerRepository {
    private static Map<String, Baker> bakerMap = new HashMap<>();

    // Baker Operations
    public static void readBakersFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String bakerName = parts[0].trim();
                    int bakerPoints = Integer.parseInt(parts[1].trim());

                    // Create a new Baker object and add it to the map
                    Baker baker = new Baker(bakerName, bakerPoints);
                    bakerMap.put(bakerName, baker);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Baker> getBakersMap() {
        return bakerMap;
    }

    public static void displayBakers() {
        // Sort the bakers by points in descending order
        bakerMap.values().stream()
                .sorted(Comparator.comparingInt(Baker::getBakerPoints).reversed())
                .forEach(baker -> System.out.println("Baker: " + baker.getBakerName() + ", Points: " + baker.getBakerPoints()));

        System.out.println("-------------------------------------------------");
    }
}