import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Employee {
    private String name;
    private Date hireDate;

    public Employee(String name, Date hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public Date getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}

public class EmployeeSorting {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Saurav", new Date(2020, 5, 15))); 
        employees.add(new Employee("Surya", new Date(2019, 3, 10)));
        employees.add(new Employee("Aman", new Date(2021, 8, 22)));
        employees.add(new Employee("Arpit", new Date(2020, 1, 5)));

        System.out.println("Employees before sorting:");
        displayEmployees(employees);

        Collections.sort(employees, Comparator.comparing(Employee::getHireDate));

        System.out.println("\nEmployees after sorting by hire date:");
        displayEmployees(employees);
    }

    private static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
