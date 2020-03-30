package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q258AddDigitsTest {

    @Test
    public void addDigits() {
        Assert.assertEquals(7, Q258AddDigits.addDigits(65536));
        Assert.assertEquals(2, Q258AddDigits.addDigits(38));
    }
}