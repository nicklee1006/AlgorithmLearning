package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q260SingleNumberIIITest {

    @Test
    public void singleNumber() {
        assertArrayEquals(new int[]{3, 5}, Q260SingleNumberIII.singleNumber(new int[]{1,2,1,3,2,5}));
    }
}