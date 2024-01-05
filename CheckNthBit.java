import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the bit position (starting from 0): ");
        int n = scanner.nextInt();
        int mask = 1 << n;
        int result = num & mask;
        boolean isNthBitSet = (result != 0);
        System.out.println("The " + n + "th bit of the number " + num + " is " + (isNthBitSet ? "set (1)" : "not set (0)"));
        scanner.close();
    }
}

