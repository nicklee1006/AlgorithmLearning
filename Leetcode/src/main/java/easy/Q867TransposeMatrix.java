package easy;

/**
 * 2018.7.21 Question 867. Transpose Matrix
 * https://leetcode.com/problems/transpose-matrix/description/
 *
 * Given a matrix A, return the transpose of A.
 *
 * The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column
 * indices of the matrix.
 *
 * Solution
 * 1. A[i][j] = B[j][i]
 */
public class Q867TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int[][] transposeMatrix = new int[A[0].length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                transposeMatrix[j][i] = A[i][j];
            }
        }

        return transposeMatrix;
    }
}
