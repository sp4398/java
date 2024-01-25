import java.util.Arrays;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
    public static void main(String[] args) {
        Person[] people = {
                new Person("Saurav", 25),
                new Person("Surya", 30),
                new Person("Aman", 22),
                new Person("Arpit", 28)
        };
        System.out.println("Array of Persons (Before Sorting):");
        displayPeopleArray(people);
        Arrays.sort(people);
        System.out.println("\nArray of Persons (After Sorting by Age):");
        displayPeopleArray(people);
    }
    private static void displayPeopleArray(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
