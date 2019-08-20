package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q303RangeSumQueryImmutableTest {

    @Test
    public void sumRange() {
        Q303RangeSumQueryImmutable test = new Q303RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});

        Assert.assertEquals(1, test.sumRange(0 ,2));
        Assert.assertEquals(-1, test.sumRange(2 ,5));
        Assert.assertEquals(-3, test.sumRange(0 ,5));
    }
}