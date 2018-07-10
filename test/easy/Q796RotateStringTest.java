package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q796RotateStringTest {

    @Test
    public void rotateString() {
        Assert.assertTrue(Q796RotateString.rotateString("abcde", "cdeab"));
        Assert.assertFalse(Q796RotateString.rotateString("abcde", "abced"));
    }
}