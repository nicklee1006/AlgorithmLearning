package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q79WordSearchTest {

    @Test
    public void exist() {
        char[][] input = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        assertTrue(Q79WordSearch.exist(input, "ABCCED"));
        assertTrue(Q79WordSearch.exist(input, "SEE"));
        assertFalse(Q79WordSearch.exist(input, "ABCB"));
    }
}