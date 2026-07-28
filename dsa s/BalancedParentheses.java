import java.util.Stack;

public class BalancedParentheses {

    public static int isBalanced(String A) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return 0; // no matching '('
                }
                stack.pop();
            }
        }

        // final check
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String A = "(())";
        System.out.println(isBalanced(A)); // Output: 1
    }
}