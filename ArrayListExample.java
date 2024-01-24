import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        employees.add(new Employee(3, "gargy", "kolkata"));
        employees.add(new Employee(1, "deesha", "delhi"));
        employees.add(new Employee(2, "bhavna", "mumbai"));
        for (Employee e : employees) {
            System.out.println(e);
        }
        Collections.sort(employees);
        System.out.println("After sorting,the values are:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
