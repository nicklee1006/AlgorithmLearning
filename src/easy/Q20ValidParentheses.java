package easy;

import java.util.Stack;

/**
 * 2018.3.20
 * Question 20: Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses
 */
public class Q20ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> beginning = new Stack<Character>();

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
