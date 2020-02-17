package medium;

public class Q221MaximalSquare {
    public static int maximalSquare(char[][] matrix) {
        int row = matrix.length;

        if (row == 0) {
            return 0;
        }

        int col = matrix[0].length;

        // additional row and col to avoid judge first row and col
        int[][] dp = new int[row + 1][col + 1];

        int result = 0;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (matrix[i - 1][j - 1] == '0') {
                    dp[i][j] = 0;
                } else {
                    // dp[i][j] = Min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]) + 1
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;

                    result = Math.max(dp[i][j], result);
                }
            }
        }

        return result * result;
    }
}
