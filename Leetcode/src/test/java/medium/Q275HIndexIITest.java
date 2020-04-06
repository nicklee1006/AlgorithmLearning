package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q275HIndexIITest {

    @Test
    public void hIndex() {
        assertEquals(3, Q275HIndexII.hIndex(new int[]{0,1,3,5,6}));
    }
}