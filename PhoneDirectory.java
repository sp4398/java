import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        Map<String, String> phoneDirectory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Phone Directory Menu:");
            System.out.println("1. Find phone number by name");
            System.out.println("2. Add a new name and phone number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name to find phone number: ");
                    String nameToFind = scanner.nextLine();
                    String phoneNumber = phoneDirectory.get(nameToFind);
                    if (phoneNumber != null) {
                        System.out.println("Phone number for " + nameToFind + ": " + phoneNumber);
                    } else {
                        System.out.println("Name not found in the directory.");
                    }
                    break;

                case 2:
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter phone number for " + newName + ": ");
                    String newPhoneNumber = scanner.nextLine();
                    phoneDirectory.put(newName, newPhoneNumber);
                    System.out.println("Entry added successfully.");
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }

            System.out.println();
        }
    }
}
