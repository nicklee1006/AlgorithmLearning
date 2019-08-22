package medium;

public class Q59SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];

        if (n == 0) {
            return result;
        }

        if (n == 1) {
            result[0][0] = 1;

            return result;
        }

        int indexX = 0;
        int indexY = 0;
        int number = 1;

        // up, right, down, left
        int[][] direction = new int[][]{
                {0, -1},
                {1, 0},
                {0, 1},
                {-1, 0}
        };

        Towards towards = Towards.RIGHT;

        int topBorder = -1;
        int rightBorder = n;
        int downBorder = n;
        int leftBorder = -1;

        while (true) {
            result[indexY][indexX] = number;

            switch (towards) {
                case UP:
                    if (indexY - 1 == topBorder) {
                        towards = Towards.RIGHT;
                        leftBorder++;

                        indexX += direction[towards.ordinal()][0];
                    } else {
                        indexY += direction[towards.ordinal()][1];
                    }
                    break;
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
                    if (indexY + 1 == downBorder) {
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
                        downBorder--;

                        indexY += direction[towards.ordinal()][1];
                    } else {
                        indexX += direction[towards.ordinal()][0];
                    }
                    break;
            }

            number++;

            if (number == n * n) {
                result[indexY][indexX] = number;

                return result;
            }
        }
    }

    private enum Towards {
        UP, RIGHT, DOWN, LEFT
    }
}
