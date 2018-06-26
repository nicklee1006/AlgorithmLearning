package easy;

/**
 * 2018.6.26 Question 680. Valid Palindrome II
 * https://leetcode.com/problems/valid-palindrome-ii/description/
 *
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a
 * palindrome.
 */
public class Q680ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        int first = 0;
        int last = s.length()-1;

        while (first <= last) {
            if (s.charAt(first) != s.charAt(last)) {
                return helper(s, first + 1, last) || helper(s, first, last - 1);
            }

            first++;
            last--;
        }

        return true;
    }

    private static boolean helper(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
