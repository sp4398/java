public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i <= 5; i++) {
            try {
                System.out.println("Element at index " + i + ": " + array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: ArrayIndexOutOfBoundsException occurred!");
            }
        }
    }
}
