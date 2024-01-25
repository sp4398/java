import java.util.Arrays;

public class PersonByName implements Comparable<PersonByName> {
    private String name;
    private int age;

    public PersonByName(String name, int age) {
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
    public int compareTo(PersonByName otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        PersonByName[] people = {
            new PersonByName("Saurav", 25),
            new PersonByName("Surya", 30),
            new PersonByName("Aman", 22),
            new PersonByName("Arpit", 28)
        };
        System.out.println("Array of Persons (Before Sorting by Name):");
        displayPeopleArray(people);
        Arrays.sort(people);
        System.out.println("\nArray of Persons (After Sorting by Name):");
        displayPeopleArray(people);
    }

    private static void displayPeopleArray(PersonByName[] people) {
        for (PersonByName person : people) {
            System.out.println(person);
        }
    }
}
