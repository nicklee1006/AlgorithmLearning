package medium;

public class Q73SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean[] isRowZero = new boolean[row];
        boolean[] isColZero = new boolean[col];

        // first loop, check which row and col has '0'
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    isRowZero[i] = true;
                    isColZero[j] = true;
                }
            }
        }

        // check row
        for (int i = 0; i < row; i++) {
            if (isRowZero[i]) {
                // set the row 0
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // check col
        for (int i = 0; i < col; i++) {
            if (isColZero[i]) {
                // set the col 0
                for (int j = 0; j < row; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
