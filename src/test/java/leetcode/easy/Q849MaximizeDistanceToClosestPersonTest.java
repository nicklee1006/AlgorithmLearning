package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q849MaximizeDistanceToClosestPersonTest {

    @Test
    public void maxDistToClosest() {
        Assert.assertEquals(2, Q849MaximizeDistanceToClosestPerson.maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
        Assert.assertEquals(3, Q849MaximizeDistanceToClosestPerson.maxDistToClosest(new int[]{1,0,0,0}));
    }
}