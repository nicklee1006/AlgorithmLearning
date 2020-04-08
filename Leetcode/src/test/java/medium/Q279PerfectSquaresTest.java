package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q279PerfectSquaresTest {

    @Test
    public void numSquares() {
        assertEquals(3, Q279PerfectSquares.numSquares(12));
        assertEquals(2, Q279PerfectSquares.numSquares(13));
    }
}