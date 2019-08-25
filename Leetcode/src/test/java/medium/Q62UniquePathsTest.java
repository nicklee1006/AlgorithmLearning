package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q62UniquePathsTest {

    @Test
    public void uniquePaths() {
        assertEquals(3, Q62UniquePaths.uniquePaths(3, 2));
        assertEquals(28, Q62UniquePaths.uniquePaths(7, 3));
        assertEquals(1, Q62UniquePaths.uniquePaths(1, 1));
    }
}