package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q240SearchA2DMatrixIITest {

    @Test
    public void searchMatrix() {
        int[][] testCase = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        assertTrue(Q240SearchA2DMatrixII.searchMatrix(testCase, 5));
        assertFalse(Q240SearchA2DMatrixII.searchMatrix(testCase, 20));
    }
}