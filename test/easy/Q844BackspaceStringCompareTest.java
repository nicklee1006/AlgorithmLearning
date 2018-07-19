package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q844BackspaceStringCompareTest {

    @Test
    public void backspaceCompare() {
        Assert.assertTrue(Q844BackspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        Assert.assertTrue(Q844BackspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        Assert.assertTrue(Q844BackspaceStringCompare.backspaceCompare("a##c", "#a#c"));
        Assert.assertTrue(Q844BackspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        Assert.assertFalse(Q844BackspaceStringCompare.backspaceCompare("a#c", "b"));
    }
}