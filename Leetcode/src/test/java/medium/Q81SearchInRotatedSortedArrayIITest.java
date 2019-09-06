package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q81SearchInRotatedSortedArrayIITest {

    @Test
    public void search() {
        assertTrue(Q81SearchInRotatedSortedArrayII.search(new int[]{2,5,6,0,0,1,2}, 0));
        assertFalse(Q81SearchInRotatedSortedArrayII.search(new int[]{2,5,6,0,0,1,2}, 3));
    }
}