package medium;

import org.junit.Assert;
import org.junit.Test;

public class Q6ZigZagConversionTest {

    @Test
    public void convert() {
        Assert.assertEquals("PAHNAPLSIIGYIR", Q6ZigZagConversion.convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", Q6ZigZagConversion.convert("PAYPALISHIRING", 4));
    }
}