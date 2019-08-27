package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q64MinimumPathSumTest {

    @Test
    public void minPathSum() {
        int[][] input1 = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        int[][] input2 = new int[][]{
                {1,3,3}
        };

        int[][] input3 = new int[][]{
                {1},
                {2},
                {4}
        };

        assertEquals(7, Q64MinimumPathSum.minPathSum(input1));
        assertEquals(7, Q64MinimumPathSum.minPathSum(input2));
        assertEquals(7, Q64MinimumPathSum.minPathSum(input3));
    }
}