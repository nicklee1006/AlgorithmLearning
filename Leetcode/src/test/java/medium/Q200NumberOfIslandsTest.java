package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q200NumberOfIslandsTest {

    @Test
    public void numIslands() {
        char[][] testCase1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        char[][] testCase2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        assertEquals(1, Q200NumberOfIslands.numIslands(testCase1));
        assertEquals(3, Q200NumberOfIslands.numIslands(testCase2));
    }
}