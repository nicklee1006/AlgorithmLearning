package easy;

/**
 * 2018.3.19
 * Question 14: Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/description/
 */
public class Q14LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        int shortest = Integer.MAX_VALUE;
        // determine the shortest
        for (String temp : strs) {
            if (temp.length() < shortest) {
                shortest = temp.length();
            }
        }

        for (int i = 0; i < shortest; i++) {
            char tempChar = strs[0].charAt(i);

            for (String temp : strs) {
                if (temp.charAt(i) != tempChar) {
                    return result.toString();
                }
            }

            result.append(tempChar);
        }

        return result.toString();
    }
}
