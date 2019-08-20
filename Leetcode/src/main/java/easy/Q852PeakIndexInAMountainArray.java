package easy;

/**
 * 2018.7.20 Question 852. Peak Index in a Mountain Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 *
 * Let's call an array A a mountain if the following properties hold:
 *
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... >
 *     A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] >
 *     A[i+1] > ... > A[A.length - 1].
 *
 * Solution
 * 1. find the largest element and return it's index
 */
public class Q852PeakIndexInAMountainArray {
    public static int peakIndexInMountainArray(int[] A) {
        int result = 0;
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                result = i;
            }
        }

        return result;
    }
}
