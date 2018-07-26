package easy;

/**
 * 2018.4.1 Question 69: Sqrt(x) https://leetcode.com/problems/sqrtx/description/
 *
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * x is guaranteed to be a non-negative integer.
 *
 * Solution:
 * 1. result <= x/result
 */
public class Q69SqrtX {
    public static int mySqrt(int x) {
        int result = 1;

        while (result <= x/result) {
            result++;
        }

        result--;

        return result;
    }
}
