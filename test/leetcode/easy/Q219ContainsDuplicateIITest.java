package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q219ContainsDuplicateIITest {

    @Test
    public void containsNearbyDuplicate() {
        Assert.assertTrue(Q219ContainsDuplicateII.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        Assert.assertTrue(Q219ContainsDuplicateII.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
    }
}