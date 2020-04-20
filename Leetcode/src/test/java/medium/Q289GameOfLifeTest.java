package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q289GameOfLifeTest {

    @Test
    public void gameOfLife() {
        int[][] input = new int[][]{
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        };

        int[][] expected = new int[][]{
                {0,0,0},
                {1,0,1},
                {0,1,1},
                {0,1,0}
        };

        Q289GameOfLife.gameOfLife(input);

        assertEquals(expected.length, input.length);

        for (int i = 0; i < input.length; i++) {
            assertEquals(expected[i].length, input[i].length);
            assertArrayEquals(expected[i], input[i]);
        }
    }
}