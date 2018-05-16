package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q344ReverseStringTest {

    @Test
    public void reverseString() {
        Assert.assertEquals("olleh", Q344ReverseString.reverseString("hello"));
    }
}