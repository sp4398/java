import java.util.Arrays;

public class GenericMaxElement {

    public static <T extends Comparable<T>> T findMaxElement(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T maxElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(maxElement) > 0) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        Integer[] intArray = {5, 8, 2, 10, 3};
        System.out.println(Arrays.toString(intArray));
        Integer maxInt = findMaxElement(intArray);
        System.out.println("Maximum Integer: " + maxInt);

        Double[] doubleArray = {3.14, 2.71, 1.618, 2.0};
        System.out.println(Arrays.toString(doubleArray));
        Double maxDouble = findMaxElement(doubleArray);
        System.out.println("Maximum Double: " + maxDouble);

        String[] stringArray = {"apple", "orange", "banana", "grape"};
        System.out.println(Arrays.toString(stringArray));
        String maxString = findMaxElement(stringArray);
        System.out.println("Maximum String: " + maxString);
    }
}
