package easy;

/**
 * 2018.5.30 Question 459. Repeated Substring Pattern
 * https://leetcode.com/problems/repeated-substring-pattern/description/
 *
 * Given a non-empty string check if it can be constructed by taking a substring of it and
 * appending multiple copies of the substring together. You may assume the given string consists
 * of lowercase English letters only and its length will not exceed 10000.
 */
public class Q459RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();

        for (int i = length/2; i >= 1; i--) {
            if (length % i == 0) {
                int segment = length / i;

                String temp = s.substring(0, i);

                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < segment; j++) {
                    stringBuilder.append(temp);
                }

                if (stringBuilder.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}
