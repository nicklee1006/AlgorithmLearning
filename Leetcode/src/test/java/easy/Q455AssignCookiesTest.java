package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q455AssignCookiesTest {

    @Test
    public void findContentChildren() {
        Assert.assertEquals(1, Q455AssignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        Assert.assertEquals(2, Q455AssignCookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}