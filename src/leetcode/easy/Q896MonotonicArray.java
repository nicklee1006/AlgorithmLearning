package leetcode.easy;

/**
 * 2018.10.21 Question 896. Monotonic Array
 * https://leetcode.com/problems/monotonic-array/description/
 *
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
 * Return true if and only if the given array A is monotonic.
 */
public class Q896MonotonicArray {
    public static boolean isMonotonic(int[] A) {
        boolean increase = false;
        boolean decrease = false;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                increase = true;
            }

            if (A[i] < A[i - 1]) {
                decrease = true;
            }
        }

        return !increase || !decrease;
    }
}
