package easy;

/**
 * 2018.4.18: Question 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and
 * ignoring cases.
 *
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 *
 * Solution
 * 1. Two points, one from beginning, one from ending
 */
public class Q125ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        // 2 pointers
        int first = 0;
        int last = s.length() - 1;

        char charFirst, charLast;
        while (first <= last) {
            charFirst = s.charAt(first);
            charLast = s.charAt(last);

            // move first forward if it's not a letter
            if (!Character.isLetterOrDigit(charFirst)) {
                first++;
                continue;
            }

            // move last backward if it's not a letter
            if (!Character.isLetterOrDigit(charLast)) {
                last--;
                continue;
            }

            // at this point, both first and last are letter, just need to know if they are same
            if (Character.toLowerCase(charFirst) != Character.toLowerCase(charLast)) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}
