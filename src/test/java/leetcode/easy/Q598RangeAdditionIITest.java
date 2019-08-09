package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q598RangeAdditionIITest {

    @Test
    public void maxCount() {
        Assert.assertEquals(4, Q598RangeAdditionII.maxCount(3, 3, new int[][]{{2,2},{3,3}}));
        Assert.assertEquals(9, Q598RangeAdditionII.maxCount(3, 3, new int[][]{}));
    }
}