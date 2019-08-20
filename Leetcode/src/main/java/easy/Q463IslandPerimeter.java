package easy;

/**
 * 2018.5.31 Question 463. Island Perimeter
 * https://leetcode.com/problems/island-perimeter/description/
 *
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and
 * 0 represents water. Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and there is exactly one island (i.e., one or
 * more connected land cells). The island doesn't have "lakes" (water inside that isn't
 * connected to the water around the island). One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100. Determine the perimeter of the
 * island.
 *
 * Solution
 * 1. Only one island
 * 2. Each 1 grid, check up, down, left, right
 */
public class Q463IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {
        int result = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    // check up cell
                    if (row == 0 || grid[row - 1][col] == 0) {
                        result++;
                    }

                    // check down cell
                    if (row == grid.length-1 || grid[row + 1][col] == 0) {
                        result++;
                    }

                    // check left cell
                    if (col == 0 || grid[row][col - 1] == 0) {
                        result++;
                    }

                    // check right cell
                    if (col == grid[row].length-1 || grid[row][col+1] == 0) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
