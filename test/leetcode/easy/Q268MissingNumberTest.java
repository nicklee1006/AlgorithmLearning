package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q268MissingNumberTest {

    @Test
    public void missingNumber() {
        Assert.assertEquals(2, Q268MissingNumber.missingNumber(new int[]{3,0,1}));
        Assert.assertEquals(8, Q268MissingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));

    }
}