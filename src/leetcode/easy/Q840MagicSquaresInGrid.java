package leetcode.easy;

/**
 * 2018.7.17 Question 840. Magic Squares In Grid
 * https://leetcode.com/problems/magic-squares-in-grid/description/
 * <p>
 * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9 such that each row, column,
 * and both diagonals all have the same sum.
 * <p>
 * Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).
 *
 * Solution
 * 1. centre of the 3*3 grid must be 5
 * 2. sum must be 15
 */
public class Q840MagicSquaresInGrid {
    public static int numMagicSquaresInside(int[][] grid) {
        int count = 0;

        for (int i = 0; i <= grid.length - 3; i++)
            for (int j = 0; j <= grid[0].length - 3; j++)
                if (isMagic(i, j, grid)) count++;

        return count;
    }

    private static boolean isMagic(int x, int y, int[][] grid) {
        if (grid[x + 1][y + 1] != 5) {
            return false;
        }

        int[] valid = new int[16];

        for (int i = x; i <= x + 2; i++) {
            for (int j = y; j <= y + 2; j++) {
                valid[grid[i][j]]++;
            }
        }

        // check contains 1-9
        for (int i = 1; i <= 9; i++) {
            if (valid[i] != 1) {
                return false;
            }
        }

        if ((grid[x][y] + grid[x][y + 1] + grid[x][y + 2]) != 15) return false;
        if ((grid[x][y] + grid[x + 1][y + 1] + grid[x + 2][y + 2]) != 15) return false;
        if ((grid[x][y] + grid[x + 1][y] + grid[x + 2][y]) != 15) return false;
        if ((grid[x + 2][y] + grid[x + 2][y + 1] + grid[x + 2][y + 2]) != 15) return false;
        if ((grid[x][y + 2] + grid[x + 1][y + 2] + grid[x + 2][y + 2]) != 15) return false;
        if ((grid[x][y + 2] + grid[x + 1][y + 1] + grid[x + 2][y]) != 15) return false;

        return true;
    }
}
