package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q130SurroundedRegionsTest {

    @Test
    public void solve() {
        char[][] input = {{'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};

        char[][] expected = {{'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}};

        Q130SurroundedRegions.solve(input);
        assertArrayEquals(expected, input);
    }
}