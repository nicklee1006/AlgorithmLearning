package medium;

public class Q64MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        // result grid
        int[][] result = new int[grid.length][grid[0].length];

        result[0][0] = grid[0][0];
        // fill the first row, one reachable from its left point
        for (int i = 1; i < grid[0].length; i++) {
            result[0][i] = result[0][i - 1] + grid[0][i];
        }
        // fill the first column, one reachable from its up point
        for (int i = 1; i < grid.length; i++) {
            result[i][0] = result[i - 1][0] + grid[i][0];
        }

        // only one row or column
        if (grid.length == 1 || grid[0].length == 1) {
            return result[grid.length - 1][grid[0].length - 1];
        }

        // start from [1, 1], fill the result array
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                result[i][j] = grid[i][j] + Math.min(result[i - 1][j], result[i][j - 1]);
            }
        }

        return result[grid.length - 1][grid[0].length - 1];
    }
}
