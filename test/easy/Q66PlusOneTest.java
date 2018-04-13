package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q66PlusOneTest {

    @Test
    public void plusOne() {
        Assert.assertArrayEquals(new int[]{1,2,3,4,6}, Q66PlusOne.plusOne(new int[]{1,2,3,4,5}));
        Assert.assertArrayEquals(new int[]{1,0,0,0,0}, Q66PlusOne.plusOne(new int[]{9,9,9,9}));
    }
}