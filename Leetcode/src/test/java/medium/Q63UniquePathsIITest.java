package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q63UniquePathsIITest {

    @Test
    public void uniquePathsWithObstacles() {
        int[][] input1 = new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int[][] input2 = new int[][]{
                {0, 0},
                {1, 1},
                {0, 0}
        };

        int[][] input3 = new int[][]{
                {1}
        };

        int[][] input4 = new int[][]{
                {0, 1}
        };

        assertEquals(2, Q63UniquePathsII.uniquePathsWithObstacles(input1));
        assertEquals(0, Q63UniquePathsII.uniquePathsWithObstacles(input2));
        assertEquals(0, Q63UniquePathsII.uniquePathsWithObstacles(input3));
        assertEquals(0, Q63UniquePathsII.uniquePathsWithObstacles(input4));
    }
}