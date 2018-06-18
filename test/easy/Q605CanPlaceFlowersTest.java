package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q605CanPlaceFlowersTest {

    @Test
    public void canPlaceFlowers() {
//        Assert.assertTrue(Q605CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
//        Assert.assertFalse(Q605CanPlaceFlowers.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        Assert.assertTrue(Q605CanPlaceFlowers.canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 1));
    }
}