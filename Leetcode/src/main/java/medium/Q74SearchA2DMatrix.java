package medium;

public class Q74SearchA2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int col = matrix[0].length;

        // loop each row, find which row the target belongs to
        for (int[] ints : matrix) {
            // target in this row
            if (target >= ints[0] && target <= ints[col - 1]) {
                // use binary search to this row
                int low = 0;
                int high = col - 1;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (target == ints[mid]) {
                        return true;
                    } else if (target < ints[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }

                return false;
            }
        }

        return false;
    }
}
