package medium;

import java.util.Stack;

public class Q150EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        // loop through the array, push the numbers in
        for (String token : tokens) {
            // check to see if it's a number or operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // if it's a number or operator, we pop the last 2 numbers
                int number1 = Integer.parseInt(stack.pop());
                int number2 = Integer.parseInt(stack.pop());

                // push the result back
                switch (token) {
                    case "+":
                        stack.push(String.valueOf(number1 + number2));
                        break;
                    case "-":
                        stack.push(String.valueOf(number2 - number1));
                        break;
                    case "*":
                        stack.push(String.valueOf(number1 * number2));
                        break;
                    case "/":
                        stack.push(String.valueOf(number2 / number1));
                        break;
                    default:
                        break;
                }
            } else {
                // if a number, just push to stack
                stack.push(token);
            }
        }

        // the last one in the stack is the result
        return Integer.parseInt(stack.pop());
    }
}
