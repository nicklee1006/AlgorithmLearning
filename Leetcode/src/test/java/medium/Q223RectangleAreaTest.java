package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q223RectangleAreaTest {

    @Test
    public void computeArea() {
        assertEquals(45, Q223RectangleArea.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
    }
}