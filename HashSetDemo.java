import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(5);
        uniqueNumbers.add(10);
        uniqueNumbers.add(15);
        uniqueNumbers.add(5);
        uniqueNumbers.add(10); 
        System.out.println("Unique Numbers:");
        printHashSetElements(uniqueNumbers);
    }
    private static void printHashSetElements(HashSet<Integer> set) {
        for (Integer element : set) {
            System.out.println(element);
        }
    }
}
