package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q415AddStringsTest {

    @Test
    public void addStrings() {
        Assert.assertEquals("15", Q415AddStrings.addStrings("6", "9"));
        Assert.assertEquals("579", Q415AddStrings.addStrings("123", "456"));

    }
}