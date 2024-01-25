import java.util.HashMap;

public class CityPopulation {
    public static void main(String[] args) {
        HashMap<String, Integer> cityPopulationMap = new HashMap<>();
        cityPopulationMap.put("Varanasi", 8419600);
        cityPopulationMap.put("Mumbai", 3990456);
        cityPopulationMap.put("Delhi", 2716000);
        cityPopulationMap.put("Banglore", 2328061);
        System.out.println("City Populations:");
        displayCityPopulations(cityPopulationMap);
    }
    private static void displayCityPopulations(HashMap<String, Integer> cityPopulationMap) {
        for (String city : cityPopulationMap.keySet()) {
            int population = cityPopulationMap.get(city);
            System.out.println(city + ": " + population);
        }
    }
}
