package leetcode.easy;

/**
 * 2018.6.2 Question 482. License Key Formatting
 * https://leetcode.com/problems/license-key-formatting/description/
 *
 * You are given a license key represented as a string S which consists only alphanumeric
 * character and dashes. The string is separated into N+1 groups by N dashes.
 *
 * Given a number K, we would want to reformat the strings such that each group contains
 * exactly K characters, except for the first group which could be shorter than K, but still
 * must contain at least one character. Furthermore, there must be a dash inserted between
 * two groups and all lowercase letters should be converted to uppercase.
 *
 * Given a non-empty string S and a number K, format the string according to the rules
 * described above.
 *
 * Solution
 * 1. Remove all '-'
 * 2. For loop, use stringBuilder, construct from back to front
 */
public class Q482LicenseKeyFormatting {
    public static String licenseKeyFormatting(String S, int K) {
        S = S.replaceAll("-", "");

        StringBuilder stringBuilder = new StringBuilder(S);

        for (int i = K; i < S.length(); i=i+K) {
            stringBuilder.insert(S.length()-i, "-");
        }

        return stringBuilder.toString().toUpperCase();
    }
}
