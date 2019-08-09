package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class Q35SearchInsertPositionTest {

    @Test
    public void searchInsert() {
        int[] nums = {1, 3, 5, 6};
        Assert.assertEquals(0, Q35SearchInsertPosition.searchInsert(nums, 0));
    }
}