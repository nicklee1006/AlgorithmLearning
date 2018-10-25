package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q908SmallestRangeITest {

    @Test
    public void smallestRangeI() {
        Assert.assertEquals(0, Q908SmallestRangeI.smallestRangeI(new int[]{1}, 0));
        Assert.assertEquals(6, Q908SmallestRangeI.smallestRangeI(new int[]{0, 10}, 2));
        Assert.assertEquals(0, Q908SmallestRangeI.smallestRangeI(new int[]{1,3,6}, 3));
    }
}