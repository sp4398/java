import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((bracket == ')' && top != '(') ||
                    (bracket == ']' && top != '[') ||
                    (bracket == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String balancedString = "{[()]}";
        String unbalancedString = "{[(])}";

        System.out.println("Is '" + balancedString + "' balanced? " + isBalanced(balancedString));
        System.out.println("Is '" + unbalancedString + "' balanced? " + isBalanced(unbalancedString));
    }
}
