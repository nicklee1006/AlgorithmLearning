package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q26RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates() {
        int[] nums = {2, 2, 2, 2, 3, 4, 5};
        Assert.assertEquals(4, Q26RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}