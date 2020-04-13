package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q287FindTheDuplicateNumberTest {

    @Test
    public void findDuplicate() {
        assertEquals(2, Q287FindTheDuplicateNumber.findDuplicate(new int[]{1,3,4,2,2}));
        assertEquals(3, Q287FindTheDuplicateNumber.findDuplicate(new int[]{3,1,3,4,2}));
    }
}