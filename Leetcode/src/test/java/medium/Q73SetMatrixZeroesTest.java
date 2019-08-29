package medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Q73SetMatrixZeroesTest {

    @Test
    public void setZeroes() {
        int[][] input1 = new int[][]{
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        int[][] input2 = new int[][]{
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        int[][] expect1 = new int[][]{
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };

        int[][] expect2 = new int[][]{
                {0, 0, 0, 0},
                {0, 4, 5, 0},
                {0, 3, 1, 0}
        };

        Q73SetMatrixZeroes.setZeroes(input1);
        Q73SetMatrixZeroes.setZeroes(input2);

        assertTrue(Arrays.deepEquals(expect1, input1));
        assertTrue(Arrays.deepEquals(expect2, input2));
    }
}