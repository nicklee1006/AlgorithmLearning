package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q888FairCandySwapTest {

    @Test
    public void fairCandySwap() {
        Assert.assertArrayEquals(new int[]{1,2}, Q888FairCandySwap.fairCandySwap(new int[]{1,1}, new int[]{2,2}));
        Assert.assertArrayEquals(new int[]{1,2}, Q888FairCandySwap.fairCandySwap(new int[]{1,2}, new int[]{2,3}));
        Assert.assertArrayEquals(new int[]{2,3}, Q888FairCandySwap.fairCandySwap(new int[]{2}, new int[]{1,3}));
        Assert.assertArrayEquals(new int[]{5, 4}, Q888FairCandySwap.fairCandySwap(new int[]{1, 2, 5}, new int[]{2,4}));
    }
}