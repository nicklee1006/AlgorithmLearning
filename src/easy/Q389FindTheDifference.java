package easy;

/**
 * 2018.5.21 Question 389. Find the Difference
 * https://leetcode.com/problems/find-the-difference/description/
 *
 * Given two strings s and t which consist of only lowercase letters.
 * String t is generated by random shuffling string s and then add one more letter at a random position.
 * Find the letter that was added in t.
 */
public class Q389FindTheDifference {
    public static char findTheDifference(String s, String t) {
        // t is one letter longer than s
        int code = t.charAt(t.length() - 1);

        for (int i = 0; i < s.length(); i++) {
            code -= s.charAt(i);
            code += t.charAt(i);
        }

        return (char)code;
    }
}