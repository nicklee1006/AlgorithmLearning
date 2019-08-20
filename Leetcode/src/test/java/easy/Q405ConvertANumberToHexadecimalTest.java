package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q405ConvertANumberToHexadecimalTest {

    @Test
    public void toHex() {
        Assert.assertEquals("1a", Q405ConvertANumberToHexadecimal.toHex(26));
        Assert.assertEquals("ffffffff", Q405ConvertANumberToHexadecimal.toHex(-1));
    }
}