package medium;

public class Q48RotateImage {
    public static void rotate(int[][] matrix) {
        int size = matrix.length;

        // first rotate by diagonal
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                exchange(matrix, i, j);
            }
        }

        // then exchange by mid
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size - j - 1];
                matrix[i][size - j - 1] = temp;
            }
        }
    }

    private static void exchange(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
