package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q167TwoSumIIInputArrayIsSortedTest {

    @Test
    public void twoSum() {
        int[] test = new int[]{2, 7, 11, 15};

        Assert.assertArrayEquals(new int[]{1,2}, Q167TwoSumIIInputArrayIsSorted.twoSum(test, 9));
    }
}