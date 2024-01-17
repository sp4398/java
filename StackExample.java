import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        System.out.println("Original Stack: " + stack);
        for (int i = 0; i < 4; i++) {
            if (!stack.isEmpty()) {
                int removedElement = stack.pop();
                System.out.println("Removed: " + removedElement);
            } else {
                System.out.println("Stack is empty.");
            }
        }
        System.out.println("\nModified Stack: " + stack);
    }
}
