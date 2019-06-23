package leetcode.easy;

import java.util.Arrays;

/**
 * 2018.10.25 Question 908. Smallest Range I
 * https://leetcode.com/problems/smallest-range-i/description/
 *
 * Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].
 * After this process, we have some array B.
 * Return the smallest possible difference between the maximum value of B and the minimum value of B.
 */
public class Q908SmallestRangeI {
    public static int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);

        if (A.length == 1) {
            return 0;
        } else {
            if ((A[A.length - 1] - A[0]) <= 2 * K) {
                return 0;
            } else {
                return A[A.length - 1] - A[0] - 2*K;
            }
        }
    }
}
