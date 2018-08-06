package easy;

/**
 * 2018.5.15 Question 326. Power of Three
 * https://leetcode.com/problems/power-of-three/description/
 *
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Follow up:
 * Could you do it without using any loop / recursion?
 *
 * Solution
 * 1. Same as Power of Two, Question 231
 */
public class Q326PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
