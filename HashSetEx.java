import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<String>();
        System.out.println("Size at the beginning " + str.size());
        str.add("apple");
        str.add("kiwi");
        str.add("banana");
        str.add("orange");
        System.out.println("Added few elements:" + str);
        System.out.println("Size after addition " + str.size());
        str.remove("banana");
        System.out.println("After remove banana from set: the elements will be:" + str);
        System.out.println("Size after removal " + str.size());
    }
}
