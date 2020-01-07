package medium;

public class Q79WordSearch {
    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        if (row == 0) {
            return false;
        }

        // mark if the point is visited
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // (i, j) as a start point
                if (dfs(board, visited, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    // true if start from (row, col), can find a solution
    private static boolean dfs(char[][] board, boolean[][] visited, int row, int col, String word, int charIndex) {
        // check index out bound
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
            return false;
        }

        // check if the grid has been visited
        // or the char doesn't match
        if (visited[row][col] || word.charAt(charIndex) != board[row][col]) {
            return false;
        }

        // already match the word
        if (charIndex == word.length() - 1) {
            return true;
        }

        // mark current grid as visited
        visited[row][col] = true;

        // check up, down, left, right
        boolean up = dfs(board, visited, row - 1, col, word, charIndex + 1);
        if (up) {
            return true;
        }

        boolean down = dfs(board, visited, row + 1, col, word, charIndex + 1);
        if (down) {
            return true;
        }

        boolean left = dfs(board, visited, row , col - 1, word, charIndex + 1);
        if (left) {
            return true;
        }

        boolean right = dfs(board, visited, row, col + 1, word, charIndex + 1);
        if (right) {
            return true;
        }

        visited[row][col] = false;
        return false;
    }
}
