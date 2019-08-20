package medium;

import java.util.ArrayList;
import java.util.List;

public class Q54SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> results = new ArrayList<>();

        if (matrix.length == 0) {
            return results;
        }

        int indexX = 0;
        int indexY = 0;

        // up, right, down, left
        int[][] direction = new int[][]{
                {0, -1},
                {1, 0},
                {0, 1},
                {-1, 0}
        };

        Towards towards = Towards.RIGHT;

        int topBorder = -1;
        int bottomBorder = matrix.length;
        int leftBorder = -1;
        int rightBorder = matrix[0].length;

        while (true) {
            // finished
            if (results.size() == matrix.length * matrix[0].length) {
                return results;
            }

            results.add(matrix[indexY][indexX]);

            switch (towards) {
                case RIGHT:
                    if (indexX + 1 == rightBorder) {
                        towards = Towards.DOWN;
                        topBorder++;

                        indexY += direction[towards.ordinal()][1];
                    } else {
                        indexX += direction[towards.ordinal()][0];
                    }

                    break;
                case DOWN:
                    if (indexY + 1 == bottomBorder) {
                        towards = Towards.LEFT;
                        rightBorder--;

                        indexX += direction[towards.ordinal()][0];
                    } else {
                        indexY += direction[towards.ordinal()][1];
                    }

                    break;
                case LEFT:
                    if (indexX - 1 == leftBorder) {
                        towards = Towards.UP;
                        bottomBorder--;

                        indexY += direction[towards.ordinal()][1];
                    } else {
                        indexX += direction[towards.ordinal()][0];
                    }
                    break;
                case UP:
                    if (indexY - 1 == topBorder) {
                        towards = Towards.RIGHT;
                        leftBorder++;

                        indexX += direction[towards.ordinal()][0];
                    } else {
                        indexY += direction[towards.ordinal()][1];
                    }
                    break;
            }
        }
    }

    private enum Towards {
        UP, RIGHT, DOWN, LEFT
    }
}
