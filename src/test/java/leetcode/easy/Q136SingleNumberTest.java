package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q136SingleNumberTest {

    @Test
    public void singleNumber() {
        Assert.assertEquals(5, Q136SingleNumber.singleNumber(new int[]{1,3,1,3,5}));
    }
}