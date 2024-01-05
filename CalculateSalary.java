class User {
    protected int id;
    protected String name;
    
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
    
class Employee extends User {
    private double salary;
    
    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }
    
    public double calculateAnnualSalary() {
        return salary * 12;
    }
}
    
public class CalculateSalary {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "John Doe", 5000.0);
    
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee " + employee.name + "'s Annual Salary: $" + annualSalary);
    }
}
    

