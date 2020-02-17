package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q221MaximalSquareTest {

    @Test
    public void maximalSquare() {
        char[][] testCase1 = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        assertEquals(4, Q221MaximalSquare.maximalSquare(testCase1));
    }
}