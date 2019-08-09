package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q697DegreeOfAnArrayTest {

    @Test
    public void findShortestSubArray() {
        Assert.assertEquals(2, Q697DegreeOfAnArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        Assert.assertEquals(6, Q697DegreeOfAnArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }
}