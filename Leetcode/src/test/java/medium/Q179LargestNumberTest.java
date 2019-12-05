package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q179LargestNumberTest {

    @Test
    public void largestNumber() {
        assertEquals("210", Q179LargestNumber.largestNumber(new int[]{10, 2}));
        assertEquals("9534330", Q179LargestNumber.largestNumber(new int[]{3,30,34,5,9}));
        assertEquals("0", Q179LargestNumber.largestNumber(new int[]{0, 0}));

    }
}