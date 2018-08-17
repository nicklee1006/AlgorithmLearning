package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018.6.13 Question 566. Reshape the Matrix
 * https://leetcode.com/problems/reshape-the-matrix/description/
 *
 * In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one
 * with different size but keep its original data.
 *
 * You're given a matrix represented by a two-dimensional array, and two positive integers r and c
 * representing the row number and column number of the wanted reshaped matrix, respectively.
 *
 * The reshaped matrix need to be filled with all the elements of the original matrix in the same
 * row-traversing order as they were.
 *
 * If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix;
 * Otherwise, output the original matrix.
 *
 * Solution
 * 1. Put all data in a list (with original sequence)
 * 2. result[i/c][colCount]
 *  2.1 reset colCount when colCount = c
 */
public class Q566ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int size = nums.length * nums[0].length;

        if (r * c != size) {
            return nums;
        }

        List<Integer> numsArray = new ArrayList<>();
        for (int[] num : nums) {
            for (int aNum : num) {
                numsArray.add(aNum);
            }
        }

        int[][] result = new int[r][c];

        int colCount = 0;
        for (int i = 0; i < size; i++) {
            result[i/c][colCount++] = numsArray.get(i);

            if (colCount == c) {
                colCount = 0;
            }
        }

        return result;
    }
}
