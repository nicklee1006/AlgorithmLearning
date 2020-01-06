package easy;

/**
 * 2018.4.1 Question 69: Sqrt(x) https://leetcode.com/problems/sqrtx/description/
 *
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * x is guaranteed to be a non-negative integer.
 *
 */
public class Q69SqrtX {
    /**
     * Do a binary search from 1 to x
     */
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;

        int result = 0;

        while (start <= end) {
            // avoid overflow if (start + end) is too large
            int mid = end - (end - start) / 2;

            if (mid == x / mid) {
                return mid;
            }

            if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
                result = mid;
            }
        }

        return result;
    }


    /**
     *  Solution:
     *  1. result <= x/result
     */
//    public static int mySqrt(int x) {
//        int result = 1;
//
//        while (result <= x / result) {
//            result++;
//        }
//
//        result--;
//
//        return result;
//    }
}
