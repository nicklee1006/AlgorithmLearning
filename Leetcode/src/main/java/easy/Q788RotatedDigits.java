package easy;

/**
 * 2018.7.9 Question 788. Rotated Digits
 * https://leetcode.com/problems/rotated-digits/description/
 *
 * X is a good number if after rotating each digit individually by 180 degrees, we get a valid
 * number that is different from X.  Each digit must be rotated - we cannot choose to leave it
 * alone.
 *
 * A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to
 * themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the
 * numbers do not rotate to any other number and become invalid.
 *
 * Now given a positive number N, how many numbers X from 1 to N are good?
 *
 * Solution
 * 1. Follow instructions
 */
public class Q788RotatedDigits {
    public static int rotatedDigits(int N) {
        int result = 0;

        for (int i = 0; i <= N; i++) {
            if (isGood(i)) {
                result++;
            }
        }

        return result;
    }

    private static boolean isGood(int n) {
        boolean isGood = false;

        while (n > 0) {
            if (n % 10 == 2) {
                isGood = true;
            } else if (n % 10 == 5) {
                isGood = true;
            } else if (n % 10 == 6) {
                isGood = true;
            } else if (n % 10 == 9) {
                isGood = true;
            } else if (n % 10 == 3) {
                return false;
            } else if (n % 10 == 4) {
                return false;
            } else if (n % 10 == 7) {
                return false;
            }

            n = n/10;
        }

        return isGood;
    }
}
