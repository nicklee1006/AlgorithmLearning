package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q274HIndexTest {

    @Test
    public void hIndex() {
        assertEquals(3, Q274HIndex.hIndex(new int[]{3,0,6,1,5}));
    }
}