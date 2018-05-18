package easy;

/**
 * 2018.5.18 Question 367. Valid Perfect Square
 * https://leetcode.com/problems/valid-perfect-square/description/
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * Note: Do not use any built-in library function such as sqrt.
 */
public class Q367ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }

        long nums = num;
        long low = 1;
        long high = num/2;
        long mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (mid * mid == nums) {
                return true;
            } else if (mid * mid < nums) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
