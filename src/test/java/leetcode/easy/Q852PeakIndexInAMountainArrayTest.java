package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q852PeakIndexInAMountainArrayTest {

    @Test
    public void peakIndexInMountainArray() {
        Assert.assertEquals(1, Q852PeakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0,1,0}));
        Assert.assertEquals(1, Q852PeakIndexInAMountainArray.peakIndexInMountainArray(new int[]{0,2,1,0}));
    }
}