package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q241DifferentWaysToAddParentheses {
    public static List<Integer> diffWaysToCompute(String input) {
        if (input.length() == 0) {
            return new ArrayList<>();
        }

        // if the whole input is a number, return directly
        if (isNumber(input)) {
            return Collections.singletonList(Integer.parseInt(input));
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            // spilt the input by an operator
            if (isOperation(input.charAt(i))) {
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));

                // combine result together
                for (Integer l : left) {
                    for (Integer r : right) {
                        result.add(calculate(l, input.charAt(i), r));
                    }
                }
            }
        }

        return result;
    }

    private static int calculate(int i, char op, int j) {
        switch (op) {
            case '+':
                return i + j;
            case '-':
                return i - j;
            case '*':
                return i * j;
        }
        return -1;
    }

    private static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);

            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperation(char c) {
        return c == '+' || c == '-' || c == '*';
    }
}
