package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q74SearchA2DMatrixTest {

    @Test
    public void searchMatrix() {
        int[][] input = new int[][]{
                {1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        assertTrue(Q74SearchA2DMatrix.searchMatrix(input, 3));
        assertFalse(Q74SearchA2DMatrix.searchMatrix(input, 13));
    }
}