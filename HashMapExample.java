import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        System.out.println("Original HashMap: " + myMap);
        String keyToAssociate = "Four";
        int valueToAssociate = 4;
        myMap.put(keyToAssociate, valueToAssociate);
        System.out.println("Updated HashMap: " + myMap);
    }
}
