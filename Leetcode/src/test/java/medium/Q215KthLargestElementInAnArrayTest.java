package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q215KthLargestElementInAnArrayTest {

    @Test
    public void findKthLargest() {
        assertEquals(5, Q215KthLargestElementInAnArray.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4, Q215KthLargestElementInAnArray.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}