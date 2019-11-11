package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q153FindMinimumInRotatedSortedArrayTest {

    @Test
    public void findMin() {
        assertEquals(1, Q153FindMinimumInRotatedSortedArray.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0, Q153FindMinimumInRotatedSortedArray.findMin(new int[]{4,5,6,7,0,1,2}));
    }
}