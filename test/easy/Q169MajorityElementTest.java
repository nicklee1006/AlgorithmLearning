package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q169MajorityElementTest {

    @Test
    public void majorityElement() {
        Assert.assertEquals(4, Q169MajorityElement.majorityElement(new int[]{1,3,5,2,4,4,4,4,4,4}));
    }
}