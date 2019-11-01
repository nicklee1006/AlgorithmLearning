package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q137SingleNumberIITest {

    @Test
    public void singleNumber() {
        assertEquals(3, Q137SingleNumberII.singleNumber(new int[]{2, 2, 3, 2}));
        assertEquals(99, Q137SingleNumberII.singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
}