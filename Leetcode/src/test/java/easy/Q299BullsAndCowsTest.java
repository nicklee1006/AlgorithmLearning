package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q299BullsAndCowsTest {

    @Test
    public void getHint() {
        assertEquals("1A3B", Q299BullsAndCows.getHint("1807", "7810"));
        assertEquals("1A1B", Q299BullsAndCows.getHint("1123", "0111"));
    }
}