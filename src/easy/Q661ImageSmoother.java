package easy;

/**
 * 2018.6.24 Question 661. Image Smoother
 * https://leetcode.com/problems/image-smoother/description/
 *
 * Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to
 * make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding
 * cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.
 */
public class Q661ImageSmoother {
    public int[][] imageSmoother(int[][] M) {
        int[][] moves = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        int row = M.length;
        int col = M[0].length;

        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int count = 1;
                int total = M[i][j];

                for (int[] move : moves) {
                    int tempI = i + move[0];
                    int tempJ = j + move[1];

                    if (tempI >= 0 && tempI < row && tempJ >= 0 && tempJ < col) {
                        count++;
                        total += M[tempI][tempJ];
                    }
                }

                result[i][j] = Math.floorDiv(total, count);
            }
        }

        return result;
    }
}
