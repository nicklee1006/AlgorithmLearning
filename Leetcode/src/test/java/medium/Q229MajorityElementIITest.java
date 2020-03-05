package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q229MajorityElementIITest {

    @Test
    public void majorityElement() {
        Integer[] expected1 = {3};
        Integer[] expected2 = {1, 2};

        assertArrayEquals(expected1, Q229MajorityElementII.majorityElement(new int[]{3, 2, 3}).toArray(new Integer[0]));
        assertArrayEquals(expected2, Q229MajorityElementII.majorityElement(new int[]{1,1,1,3,3,2,2,2}).toArray(new Integer[0]));
    }
}