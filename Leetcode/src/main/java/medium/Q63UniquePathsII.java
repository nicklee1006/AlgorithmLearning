package medium;

public class Q63UniquePathsII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int columns = obstacleGrid[0].length;
        int rows = obstacleGrid.length;

        int[][] result = new int[rows][columns];

        result[rows - 1][columns - 1] = obstacleGrid[rows - 1][columns - 1] == 1 ? 0 : 1;
        int obstacle = 0;
        // fill right most column and last row with 1
        for (int i = columns - 1; i >= 0; i--) {
            if (obstacleGrid[rows - 1][i] == 1) {
                obstacle = -1;
            }

            result[rows - 1][i] = 1 + obstacle;
        }

        obstacle = 0;
        for (int i = rows - 1; i >= 0; i--) {
            if (obstacleGrid[i][columns - 1] == 1) {
                obstacle = -1;
            }

            result[i][columns - 1] = 1 + obstacle;
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = columns - 2; j >= 0; j--) {
                if ((obstacleGrid[i][j + 1] == 1 && obstacleGrid[i + 1][j] == 1) || obstacleGrid[i][j] == 1) {
                    result[i][j] = 0;
                } else if (obstacleGrid[i][j + 1] == 1) {
                    result[i][j] = result[i + 1][j];
                } else if (obstacleGrid[i + 1][j] == 1) {
                    result[i][j] = result[i][j + 1];
                } else {
                    result[i][j] = result[i][j + 1] + result[i + 1][j];
                }
            }
        }

        return result[0][0];
    }
}
