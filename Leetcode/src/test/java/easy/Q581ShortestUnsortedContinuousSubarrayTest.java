package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q581ShortestUnsortedContinuousSubarrayTest {

    @Test
    public void findUnsortedSubarray() {
        Assert.assertEquals(5, Q581ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
}