package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q443StringCompressionTest {

    @Test
    public void compress() {
        Assert.assertEquals(6, Q443StringCompression.compress(new char[]{'a','a','b','b','c','c','c'}));
        Assert.assertEquals(1, Q443StringCompression.compress(new char[]{'a'}));

    }
}