package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q220ContainsDuplicateIIITest {

    @Test
    public void containsNearbyAlmostDuplicate() {
        assertTrue(Q220ContainsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1,2,3,1}, 3, 0));
        assertTrue(Q220ContainsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1,0,1,1}, 1, 2));
        assertFalse(Q220ContainsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 2, 3));
        assertTrue(Q220ContainsDuplicateIII.containsNearbyAlmostDuplicate(new int[]{0,2147483647}, 1, 2147483647));
    }
}