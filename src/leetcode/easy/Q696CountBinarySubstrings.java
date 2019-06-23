package leetcode.easy;

/**
 * 2018.7.2 Question 696. Count Binary Substrings
 * https://leetcode.com/problems/count-binary-substrings/description/
 *
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number
 * of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 * hint:
 * https://leetcode.com/problems/count-binary-substrings/discuss/108625/PythonC++Java-Easy-and-Concise-with-Explanation
 *
 * Solution
 * 1. ***Can't understand
 */
public class Q696CountBinarySubstrings {
    public static int countBinarySubstrings(String s) {
        int current = 1;
        int previous = 0;
        int result = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                current++;
            } else {
                result += Math.min(current, previous);
                previous = current;
                current = 1;
            }
        }

        return result + Math.min(current, previous);
    }
}
