package easy;

/**
 * 2018.5.16 Question 342. Power of Four
 * https://leetcode.com/problems/power-of-four/description/
 *
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 *
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 *
 * Follow up: Could you solve it without loops/recursion?
 *
 * Solution
 * 1. Same as Power of Three, Question 326
 */
public class Q342PowerOfFour {
    public static boolean isPowerOfFour(int num) {
        if (num == 0) {
            return false;
        }

        while (num % 4 == 0) {
            num /= 4;
        }

        return num == 1;
    }
}
