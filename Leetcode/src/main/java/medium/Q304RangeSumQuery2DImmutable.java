package medium;

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
public class Q304RangeSumQuery2DImmutable {
    private int[][] matrixAccumulate;

    public Q304RangeSumQuery2DImmutable(int[][] matrix) {
        int row = matrix.length;

        if (row == 0) {
            return;
        }

        int col = matrix[0].length;

        matrixAccumulate = new int[row + 1][col + 1];

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                matrixAccumulate[i][j] = matrix[i - 1][j - 1] + matrixAccumulate[i - 1][j] + matrixAccumulate[i][j - 1] - matrixAccumulate[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return matrixAccumulate[row2 + 1][col2 + 1] - matrixAccumulate[row1][col2 + 1] - matrixAccumulate[row2 + 1][col1] + matrixAccumulate[row1][col1];
    }
}
