import java.util.HashMap;
import java.util.Map;

public class MaxValueKey {
    public static void main(String[] args) {
        HashMap<String, Integer> keyValueMap = new HashMap<>();
        keyValueMap.put("A", 10);
        keyValueMap.put("B", 25);
        keyValueMap.put("C", 15);
        keyValueMap.put("D", 30);
        String maxKey = findMaxValueKey(keyValueMap);
        System.out.println("The Key with maximum Value is: " + maxKey);
    }
    private static <K, V extends Comparable<V>> K findMaxValueKey(Map<K, V> map) {
        K maxKey = null;
        V maxValue = null;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (maxKey == null || entry.getValue().compareTo(maxValue) > 0) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return maxKey;
    }
}
