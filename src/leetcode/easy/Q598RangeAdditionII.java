package leetcode.easy;

/**
 * 2018.6.17 Question 598. Range Addition II
 * https://leetcode.com/problems/range-addition-ii/description/
 *
 * Given an m * n matrix M initialized with all 0's and several update operations.
 *
 * Operations are represented by a 2D array, and each operation is represented by an array with two positive
 * integers a and b, which means M[i][j] should be added by one for all 0 <= i < a and 0 <= j < b.
 *
 * You need to count and return the number of maximum integers in the matrix after performing all the
 * operations.
 *
 * Solution
 * 1. found min #row and #col
 * 2. return col * row
 */
public class Q598RangeAdditionII {
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) {
            return m*n;
        }

        int row = Integer.MAX_VALUE;
        int col = Integer.MAX_VALUE;

        for (int[] temp : ops) {
            row = Math.min(row, temp[0]);
            col = Math.min(col, temp[1]);
        }

        return row*col;
    }
}
