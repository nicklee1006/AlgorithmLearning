package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q868BinaryGapTest {

    @Test
    public void binaryGap() {
        Assert.assertEquals(2, Q868BinaryGap.binaryGap(22));
        Assert.assertEquals(2, Q868BinaryGap.binaryGap(5));
        Assert.assertEquals(1, Q868BinaryGap.binaryGap(6));
        Assert.assertEquals(0, Q868BinaryGap.binaryGap(8));
    }
}