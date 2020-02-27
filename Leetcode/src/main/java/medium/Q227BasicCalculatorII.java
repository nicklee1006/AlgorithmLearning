package medium;

import java.util.Stack;

public class Q227BasicCalculatorII {
    public static int calculate(String s) {
        char[] chars = s.toCharArray();

        // use 2 stacks
        // one to store numbers
        // another to store operators
        Stack<Integer> intStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();

        // loop through all chars
        int temp = -1;
        for (char tempChar : chars) {
            // skip space
            if (tempChar == ' ') {
                continue;
            }

            // construct the number
            if (isNumber(tempChar)) {
                if (temp == -1) {
                    temp = tempChar - '0';
                } else {
                    temp = temp * 10 + tempChar - '0';
                }
                // we have met an operator
            } else {
                // push the number to stack
                if (temp != -1) {
                    intStack.push(temp);
                    temp = -1;
                }

                // compare the operator with the operator at the top of stack
                while (!opStack.isEmpty()) {
                    // if new operator is a higher priority one, break, push to stack directly
                    if (compareOp(tempChar, opStack.peek())) {
                        break;
                    }

                    // the operator at the top of stack is a lower priority, do the calc
                    int num1 = intStack.pop();
                    int num2 = intStack.pop();

                    // push the calc result in stack again
                    intStack.push(calc(num1, num2, opStack.pop()));
                }

                // push the current op in stack
                opStack.push(tempChar);
            }
        }

        // if any left number
        if (temp != -1) {
            intStack.push(temp);
        }

        // finish left over elements in stack
        while (!opStack.isEmpty()) {
            int num1 = intStack.pop();
            int num2 = intStack.pop();

            intStack.push(calc(num1, num2, opStack.pop()));
        }

        return intStack.pop();
    }

    private static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean compareOp(char op1, char op2) {
        if (op1 == '*' || op1 == '/') {
            return op2 == '+' || op2 == '-';
        }

        return false;
    }

    private static int calc(int num1, int num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num2 - num1;
            case '*':
                return num1 * num2;
            case '/':
                return num2 / num1;
        }
        return 0;
    }
}
