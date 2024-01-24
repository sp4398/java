import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {
        TreeMap<String, Integer> nameAgeMap = new TreeMap<>();

        nameAgeMap.put("John", 25);
        nameAgeMap.put("Alice", 30);
        nameAgeMap.put("Bob", 22);
        nameAgeMap.put("Eva", 28);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name to search for (type 'exit' to quit): ");
            String searchName = scanner.nextLine();

            if (searchName.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            Integer age = nameAgeMap.get(searchName);

            if (age != null) {
                System.out.println("Age of " + searchName + ": " + age);
            } else {
                System.out.println(searchName + " not found in the TreeMap.");
            }
        }

        scanner.close();
    }
}
