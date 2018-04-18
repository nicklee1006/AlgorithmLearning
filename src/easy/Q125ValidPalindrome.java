package easy;

/**
 * 2018.4.18: Question 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 */
public class Q125ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        int first = 0;
        int last = s.length() - 1;

        char charFirst, charLast;
        while (first <= last) {
            charFirst = s.charAt(first);
            charLast = s.charAt(last);

            if (!Character.isLetterOrDigit(charFirst)) {
                first++;
                continue;
            }

            if (!Character.isLetterOrDigit(charLast)) {
                last--;
                continue;
            }

            if (Character.toLowerCase(charFirst) != Character.toLowerCase(charLast)) {
                return false;
            }

            first++;
            last--;
        }

        return true;
    }
}
