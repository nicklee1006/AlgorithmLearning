package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q169MajorityElementTest {

    @Test
    public void majorityElement() {
        Assert.assertEquals(4, Q169MajorityElement.majorityElement(new int[]{1,3,5,2,4,4,4,4,4,4}));
    }
}