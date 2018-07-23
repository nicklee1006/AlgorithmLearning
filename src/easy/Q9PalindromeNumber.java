package easy;

/**
 * 2018.3.17 Question 9: Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward
 * as forward.
 *
 * 1. get how many digit of the number
 *  1.1 int length = String.valueOf(number).length()
 * 2. get (1, length), (2, length-1)th digit, see if they are same
 */
public class Q9PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int numberOfDigits = 0;
        int temp = x;

        if (x < 0) {
            return false;
        }

        // get how many digits
        while (Math.abs(temp) % 10 > 0 || temp / 10 != 0) {
            numberOfDigits++;
            temp = temp / 10;
        }

        for (int i = 0; i < numberOfDigits / 2; i++) {
            int first;
            int last;

            first = (x / (int) Math.pow(10, numberOfDigits - 1 - i)) % 10;
            last = (x / (int) Math.pow(10, i)) % 10;

            if (first != last) {
                return false;
            }
        }

        return true;
    }
}
