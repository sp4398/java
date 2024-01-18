import java.util.HashSet;

public class AppendToHashset {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();

        stringSet.add("Element 1");
        stringSet.add("Element 2");
        stringSet.add("Element 3");
        System.out.println("Original HashSet: " + stringSet);

        String elementToAppend = "New Element";
        stringSet.add(elementToAppend);
        System.out.println("HashSet after appending: " + stringSet);
    }
}
