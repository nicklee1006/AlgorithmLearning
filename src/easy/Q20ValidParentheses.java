package easy;

import java.util.Stack;

/**
 * 2018.3.20 Question 20: Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
 * string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Solution
 * 1. Use a stack (last in, first out)
 * 2. Meet '(', '[', or '{', push into stack
 * 3. if not, check the top element of stack if it is corresponding beginning
 */
public class Q20ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> beginning = new Stack<>();

        if (s.length() < 2) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                beginning.push(current);
                continue;
            }

            if (current == ')') {
                if (beginning.empty()) {
                    return false;
                }

                if (beginning.peek() == '(') {
                    beginning.pop();
                } else {
                    return false;
                }
            } else if (current == ']') {
                if (beginning.empty()) {
                    return false;
                }

                if (beginning.peek() == '[') {
                    beginning.pop();
                } else {
                    return false;
                }
            } else if (current == '}') {
                if (beginning.empty()) {
                    return false;
                }

                if (beginning.peek() == '{') {
                    beginning.pop();
                } else {
                    return false;
                }
            }
        }

        return beginning.empty();
    }
}
