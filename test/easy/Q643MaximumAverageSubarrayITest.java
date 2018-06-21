package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q643MaximumAverageSubarrayITest {

    @Test
    public void findMaxAverage() {
        Assert.assertEquals(12.75, Q643MaximumAverageSubarrayI.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4), 0.1);
        Assert.assertEquals(4, Q643MaximumAverageSubarrayI.findMaxAverage(new int[]{0, 4, 0, 3, 2}, 1), 0.1);

    }
}