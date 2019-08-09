package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q476NumberComplementTest {

    @Test
    public void findComplement() {
        Assert.assertEquals(2, Q476NumberComplement.findComplement(5));
        Assert.assertEquals(0, Q476NumberComplement.findComplement(1));
    }
}