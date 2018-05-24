package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q414ThirdMaximumNumberTest {

    @Test
    public void thirdMax() {
        Assert.assertEquals(1, Q414ThirdMaximumNumber.thirdMax(new int[]{3,2,1}));
        Assert.assertEquals(2, Q414ThirdMaximumNumber.thirdMax(new int[]{1,2}));
        Assert.assertEquals(1, Q414ThirdMaximumNumber.thirdMax(new int[]{2,2,3,1}));

    }
}