package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q136SingleNumberTest {

    @Test
    public void singleNumber() {
        Assert.assertEquals(5, Q136SingleNumber.singleNumber(new int[]{1,3,1,3,5}));
        Assert.assertEquals(1, Q136SingleNumber.singleNumber(new int[]{2, 2, 1}));
        Assert.assertEquals(4, Q136SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}