package easy;

/**
 * 2018.6.8 Question 521. Longest Uncommon Subsequence I
 * https://leetcode.com/problems/longest-uncommon-subsequence-i/description/
 *
 * Given a group of two strings, you need to find the longest uncommon subsequence of this group of two
 * strings.
 * The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this
 * subsequence should not be any subsequence of the other strings.
 *
 * A subsequence is a sequence that can be derived from one sequence by deleting some characters without
 * changing
 * the order of the remaining elements. Trivially, any string is a subsequence of itself and an empty string
 * is a
 * subsequence of any string.
 *
 * The input will be two strings, and the output needs to be the length of the longest uncommon subsequence.
 * If the
 * longest uncommon subsequence doesn't exist, return -1.
 *
 * Note:
 *
 * Both strings' lengths will not exceed 100.
 * Only letters from a ~ z will appear in input strings.
 *
 * Solution
 * 1. If a and b are equal, then return -1
 * 2. Otherwise just return the longer string
 */
public class Q521LongestUncommonSubsequenceI {
    public static int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }

        return Math.max(a.length(), b.length());
    }
}
