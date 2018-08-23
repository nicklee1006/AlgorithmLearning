package easy;

/**
 * 2018.7.1 Question 695. Max Area of Island
 * https://leetcode.com/problems/max-area-of-island/description/
 *
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land)
 * connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are
 * surrounded by water.
 *
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area
 * is 0.)
 *
 * Solution
 * 1. helper function to count area
 * 2. recursive
 */
public class Q695MaxAreaOfIsland {
    public static int maxAreaOfIsland(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    result = Math.max(result, countArea(grid, i, j));
                }
            }
        }

        return result;
    }

    private static int countArea(int[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1) {
            grid[i][j] = 0;

            return 1 + countArea(grid, i + 1, j) + countArea(grid, i - 1, j) + countArea(grid, i, j + 1) + countArea(grid, i, j - 1);
        }

        return 0;
    }
}
