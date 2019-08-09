package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q22GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();

        generateAll(results, "", 0, 0, n);

        return results;
    }

    private static void generateAll(List<String> result, String current, int left, int right, int n) {
        if (current.length() == n * 2) {
            result.add(current);

        } else {
            if (left < n) {
                generateAll(result, current + "(", left + 1, right, n);
            }

            if (right < left) {
                generateAll(result, current + ")", left, right + 1, n);
            }
        }
    }

    /**
     * Brute force.
     */
//    public static List<String> generateParenthesis(int n) {
//        List<String> results = new ArrayList<>();
//
//        generateAll(results, new char[n * 2], 0);
//
//        return results;
//    }
//
//    private static void generateAll(List<String> result, char[] current, int pos) {
//        if (pos == current.length) {
//            if (isValid(current)) {
//                result.add(new String(current));
//            }
//        } else {
//            current[pos] = '(';
//            generateAll(result, current, pos + 1);
//            current[pos] = ')';
//            generateAll(result, current, pos + 1);
//        }
//    }
//
//    private static boolean isValid(char[] current) {
//        int balance = 0;
//
//        for (char c : current) {
//            if (c == '(') {
//                balance++;
//            } else {
//                balance--;
//            }
//
//            if (balance < 0) {
//                return false;
//            }
//        }
//
//        return balance == 0;
//    }
}
