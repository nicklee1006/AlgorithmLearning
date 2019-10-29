package medium;

import util.UnionFind;

public class Q130SurroundedRegions {
    public static void solve(char[][] board) {
        int rowNum = board.length;
        if (rowNum < 3) {
            return;
        }

        int colNum = board[0].length;
        if (colNum < 3) {
            return;
        }

        // at least 3 * 3
        UnionFind unionFind = new UnionFind(rowNum * colNum + 1);

        // create a dummy node
        int dummyNode = rowNum * colNum;

        // first loop, connect border with dummy node
        // or connect all 'o' node
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (board[i][j] == 'O') {
                    // border
                    if (i == 0 || i == rowNum - 1 || j == 0 || j == colNum - 1) {
                        unionFind.union(dummyNode, i * colNum + j);
                    } else {
                        // connect up, left, down, right
                        if (board[i - 1][j] == 'O') {
                            unionFind.union(i * colNum + j, (i - 1) * colNum + j);
                        }

                        if (board[i + 1][j] == 'O') {
                            unionFind.union(i * colNum + j, (i + 1) * colNum + j);
                        }

                        if (board[i][j - 1] == 'O') {
                            unionFind.union(i * colNum + j, i * colNum + (j - 1));
                        }

                        if (board[i][j + 1] == 'O') {
                            unionFind.union(i * colNum + j, i * colNum + (j + 1));
                        }
                    }
                }
            }
        }

        // now that everything is classified into 2 classes
        // second loop to find all node not same as dummy node
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (unionFind.isConnected(i * colNum + j, dummyNode)) {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
