package medium;

public class Q62UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] result = new int[n][m];

        result[n - 1][m - 1] = 1;
        // fill right most column and last row with 1
        for (int i = 0; i < m - 1; i++) {
            result[n - 1][i] = 1;
        }

        for (int i = 0; i < n - 1; i++) {
            result[i][m - 1] = 1;
        }

        // fill the table from second last row
        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                result[i][j] = result[i][j + 1] + result[i + 1][j];
            }
        }

        return result[0][0];
    }
}
