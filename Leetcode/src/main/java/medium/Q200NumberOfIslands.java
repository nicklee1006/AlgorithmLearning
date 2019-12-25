package medium;

public class Q200NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int result = 0;

        // total number of rows
        int rows = grid.length;

        if (rows == 0) {
            return result;
        }

        // total number of columns
        int columns = grid[0].length;

        // loop all points
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    result++;

                    mark(i, j, rows, columns, grid);
                }
            }

        }

        return result;
    }

    // mark all '1' connected with grid[curRow][curCol] as '2'
    private static void mark(int curRow, int curCol, int totalRow, int totalCol, char[][] grid) {
        // reach boundary or the point is not '1'
        if (curRow == -1 || curCol == -1 || curRow == totalRow || curCol == totalCol || grid[curRow][curCol] != '1') {
            return;
        }

        // mark as '2'
        grid[curRow][curCol] = 2;

        // expand up, down, left, right
        mark(curRow - 1, curCol, totalRow, totalCol, grid);
        mark(curRow + 1, curCol, totalRow, totalCol, grid);
        mark(curRow, curCol - 1, totalRow, totalCol, grid);
        mark(curRow, curCol + 1, totalRow, totalCol, grid);
    }
}
