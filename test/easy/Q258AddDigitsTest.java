package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q258AddDigitsTest {

    @Test
    public void addDigits() {
        Assert.assertEquals(7, Q258AddDigits.addDigits(65536));
    }
}