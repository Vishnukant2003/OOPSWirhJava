package Stack;
import java.util.Stack;

public class InfixtoPrefix {
    static int Precedence(char ch) {
        switch(ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default :
                return -1;
        }
    }

    static String Convert(String exp) {
        // Step 1: Reverse the string and swap the bracket orientations
        StringBuilder  reversedInfix= new StringBuilder();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);
            if (c == '(') {
                reversedInfix.append(')');
            } else if (c == ')') {
                reversedInfix.append('(');
            } else {
                reversedInfix.append(c);
            }
        }

        // Step 2: Modified Infix-to-Postfix style execution
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } 
            else if (c == '(') {
                stack.push(c);
            } 
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Remove the matching '(' from stack
                }
            } 
            else { // Operator encountered
                // Notice strictly less than (<) here to properly balance associativity during reversal
                while (!stack.isEmpty() && Precedence(c) < Precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                System.out.println("Invalid expression");
            }
            result.append(stack.pop());
        }

        // Step 3: Reverse the intermediate string to get the final Prefix output
        return result.reverse().toString();
    }

    public static void main(String[] args) {
//        String infix = "(A+B)*C";
    	String infix = "(A+B)*C";
        String preFix = Convert(infix);
        System.out.println("Infix:  " + infix);
        System.out.println("Prefix: " + preFix); 
        // Correct Output will be: *+ABC
    }
}
