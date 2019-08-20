package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q485MaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnes() {
        Assert.assertEquals(3, Q485MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        Assert.assertEquals(6, Q485MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,1,1,1,1}));
        Assert.assertEquals(0, Q485MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[]{0,0,0,0,0,0}));
    }
}