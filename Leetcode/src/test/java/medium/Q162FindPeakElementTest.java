package medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q162FindPeakElementTest {

    @Test
    public void findPeakElement() {
        assertEquals(2, Q162FindPeakElement.findPeakElement(new int[]{1,2,3,1}));
        assertEquals(5, Q162FindPeakElement.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
}