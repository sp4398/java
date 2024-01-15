import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        System.out.println("Original List: " + numbers);
        int sumOfEvenNumbers = calculateSumOfEvenNumbers(numbers);
        System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);
    }

    private static int calculateSumOfEvenNumbers(ArrayList<Integer> list) {
        int sum = 0;

        for (int number : list) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }
}
