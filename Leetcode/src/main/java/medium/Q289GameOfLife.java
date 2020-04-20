package medium;

public class Q289GameOfLife {
    public static void gameOfLife(int[][] board) {
        if (board.length == 0) {
            return;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int count = countOnes(i, j, board.length, board[0].length, board);

                // original is 0
                if (board[i][j] == 0) {
                    if (count == 3) {
                        // -1 means it's changed from 0 -> 1
                        board[i][j] = -1;
                    }
                }

                // original is 1
                if (board[i][j] == 1) {
                    if (count < 2 || count > 3) {
                        // 2 means it's changed from 1 -> 0
                        board[i][j] = 2;
                    }
                }
            }
        }

        // restore -1 and 2
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 1;
                }

                if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private static int countOnes(int row, int col, int totalRow, int totalCol, int[][] board) {
        int result = 0;

        // up
        if (row - 1 >= 0 && (board[row - 1][col] == 1 || board[row - 1][col] == 2)) {
            result++;
        }

        // bottom
        if (row + 1 < totalRow && (board[row + 1][col] == 1 || board[row + 1][col] == 2)) {
            result++;
        }

        // left
        if (col - 1 >= 0 && (board[row][col - 1] == 1 || board[row][col - 1] == 2)) {
            result++;
        }

        // right
        if (col + 1 < totalCol && (board[row][col + 1] == 1 || board[row][col + 1] == 2)) {
            result++;
        }

        // top-left
        if (row - 1 >= 0 && col - 1 >= 0 && (board[row - 1][col - 1] == 1 || board[row - 1][col - 1] == 2)) {
            result++;
        }

        // top-right
        if (row - 1 >= 0 && col + 1 < totalCol && (board[row - 1][col + 1] == 1 || board[row - 1][col + 1] == 2)) {
            result++;
        }

        // bottom-left
        if (row + 1 < totalRow && col - 1 >= 0 && (board[row + 1][col - 1] == 1 || board[row + 1][col - 1] == 2)) {
            result++;
        }

        // bottom-right
        if (row + 1 < totalRow && col + 1 < totalCol && (board[row + 1][col + 1] == 1 || board[row + 1][col + 1] == 2)) {
            result++;
        }

        return result;
    }
}
