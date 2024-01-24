import java.util.HashMap;

public class HashMapCheckEmpty {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();

        if (myMap.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }

        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);

        if (myMap.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }
    }
}
