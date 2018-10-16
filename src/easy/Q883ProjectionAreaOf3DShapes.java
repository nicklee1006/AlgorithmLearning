package easy;

/**
 * 2018.10.16 Question 883. Projection Area of 3D Shapes
 * https://leetcode.com/problems/projection-area-of-3d-shapes/description/
 *
 * On a N * N grid, we place some 1 * 1 * 1 cubes that are axis-aligned with the x, y, and z axes.
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 * Now we view the projection of these cubes onto the xy, yz, and zx planes.
 * A projection is like a shadow, that maps our 3 dimensional figure to a 2 dimensional plane.
 * Here, we are viewing the "shadow" when looking at the cubes from the top, the front, and the side.
 * Return the total area of all three projections.
 *
 * area xy: every grid > 0, +1
 * area xz: max value of every row
 * area yz: max value of every col
 */
public class Q883ProjectionAreaOf3DShapes {
    public static int projectionArea(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > 0) {
                    result++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            int tempMax = 0;
            for (int j = 0; j < grid.length; j++) {
                tempMax = Math.max(tempMax, grid[i][j]);
            }

            result += tempMax;
        }

        for (int i = 0; i < grid.length; i++) {
            int tempMax = 0;
            for (int j = 0; j < grid.length; j++) {
                tempMax = Math.max(tempMax, grid[j][i]);
            }

            result += tempMax;
        }

        return result;
    }
}
