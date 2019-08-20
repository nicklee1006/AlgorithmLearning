package easy;

/**
 * 2018.10.19 Question 892. Surface Area of 3D Shapes
 * https://leetcode.com/problems/surface-area-of-3d-shapes/description/
 *
 * On a N * N grid, we place some 1 * 1 * 1 cubes
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 * Return the total surface area of the resulting shapes.
 */
public class Q892SurfaceAreaOf3DShapes {
    public static int surfaceArea(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > 0) {
                    result += grid[i][j] * 4 +2;
                }

                if (i > 0) {
                    result -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                }

                if (j > 0) {
                    result -= Math.min(grid[i][j], grid[i][j-1]) * 2;
                }
            }
        }

        return result;
    }
}
