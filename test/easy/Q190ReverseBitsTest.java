package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q190ReverseBitsTest {

    @Test
    public void reverseBits() {
        Assert.assertEquals(964176192, Q190ReverseBits.reverseBits(43261596));
    }
}