package medium;

import java.util.HashSet;
import java.util.Set;

public class Q36ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        Set<Integer> numberSet = new HashSet<>();
        
        // check rows, if contains duplicates
        for (char[] chars : board) {
            for (char temp : chars) {
                if (temp != '.') {
                    if (!numberSet.add(Character.getNumericValue(temp))) {
                        return false;
                    }
                }
            }

            // finished one row
            numberSet.clear();
        }

        // check cols, if contains duplicates
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != '.') {
                    if (!numberSet.add(Character.getNumericValue(board[j][i]))) {
                        return false;
                    }
                }
            }

            // finished one column
            numberSet.clear();
        }

        // check small grid
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                // check small grid
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i + k][j + l] != '.') {
                            if (!numberSet.add(Character.getNumericValue(board[i + k][j + l]))) {
                                return false;
                            }
                        }
                    }
                }

                // finished one 3*3 grid
                numberSet.clear();
            }
        }

        return true;
    }
}
