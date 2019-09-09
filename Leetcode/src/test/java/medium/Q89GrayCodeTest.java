package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q89GrayCodeTest {

    @Test
    public void grayCode() {
        Integer[] expected1 = new Integer[]{0,1,3,2};
        Integer[] expected2 = new Integer[]{0};

        assertArrayEquals(expected1, Q89GrayCode.grayCode(2).toArray());
        assertArrayEquals(expected2, Q89GrayCode.grayCode(0).toArray());
    }
}