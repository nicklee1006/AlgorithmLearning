package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q496NextGreaterElementITest {

    @Test
    public void nextGreaterElement() {
        Assert.assertArrayEquals(new int[]{-1,3,-1}, Q496NextGreaterElementI.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
        Assert.assertArrayEquals(new int[]{3,-1}, Q496NextGreaterElementI.nextGreaterElement(new int[]{2, 4}, new int[]{1,2,3,4}));
    }
}