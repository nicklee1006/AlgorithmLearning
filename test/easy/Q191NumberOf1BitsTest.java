package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q191NumberOf1BitsTest {

    @Test
    public void hammingWeight() {
        Assert.assertEquals(3, Q191NumberOf1Bits.hammingWeight(11));
    }
}