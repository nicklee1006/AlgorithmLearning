package medium;

import org.junit.Test;
import testutil.ArrayUtil;

import static org.junit.Assert.*;

public class Q80RemoveDuplicatesFromSortedArrayIITest {

    @Test
    public void removeDuplicates() {
        int[] input1 = new int[]{1,1,1,2,2,3};
        int[] input2 = new int[]{0,0,1,1,1,1,2,3,3};

        int[] expected1 = new int[]{1, 1, 2, 2, 3};
        int[] expected2 = new int[]{0, 0, 1, 1, 2, 3, 3};

        assertEquals(5, Q80RemoveDuplicatesFromSortedArrayII.removeDuplicates(input1));
        assertTrue(ArrayUtil.firstNElementsEquals(input1, expected1, 5));

        assertEquals(7, Q80RemoveDuplicatesFromSortedArrayII.removeDuplicates(input2));
        assertTrue(ArrayUtil.firstNElementsEquals(input2, expected2, 7));
    }
}