package easy;

/**
 * 2018.5.12 Question 263. Ugly Number
 * https://leetcode.com/problems/ugly-number/description/
 *
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 */
public class Q263UglyNumber {
    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }

        int[] divider = {2, 3, 5};
        for (int temp : divider) {
            while (num % temp == 0) {
                num /= temp;
            }
        }

        return num == 1;
    }
}
