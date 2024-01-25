import java.util.ArrayList;
import java.util.HashSet;

public class StudentList {

    public static void main(String[] args) {
        ArrayList<String> sNames = new ArrayList<>();
        sNames.add("Saurav");
        sNames.add("Surya");
        sNames.add("Aman");
        sNames.add("Arpit");
        sNames.add("Saurav"); 
        sNames.add("Aman"); 

        System.out.println("List of Student Names:");
        printSNames(sNames);

        removeDuplicates(sNames);

        System.out.println("\nUpdated List:");
        printSNames(sNames);
    }

    private static void printSNames(ArrayList<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
    private static void removeDuplicates(ArrayList<String> names) {
        HashSet<String> unique = new HashSet<>(names);
        names.clear();
        names.addAll(unique);
    }
}
