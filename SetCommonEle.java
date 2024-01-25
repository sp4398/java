import java.util.HashSet;
import java.util.Set;

public class SetCommonEle {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        boolean hasCommonElements = haveCommonElements(set1, set2);
        System.out.println(hasCommonElements);
    }
    private static <T> boolean haveCommonElements(Set<T> set1, Set<T> set2) {
        for (T element : set1) {
            if (set2.contains(element)) {
                return true;
            }
        }
        return false;
    }
}
