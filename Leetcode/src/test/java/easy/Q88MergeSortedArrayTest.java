package easy;

import org.junit.Assert;
import org.junit.Test;

public class Q88MergeSortedArrayTest {

    @Test
    public void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2,5,6};

        int[] expected = {1,2,2,3,5,6};

        Q88MergeSortedArray.merge(nums1, 3, nums2, 3);

        Assert.assertArrayEquals(nums1, expected);
    }
}