package easy;

/**
 * 2018.3.26 Question 53: Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the
 * largest sum and return its sum.
 *
 */
public class Q53MaximumSubarray {
    /**
     * Solution
     *  * 1. Each element is max (previous + current, current)
     */
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int result = nums[0];
        int previous = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(nums[i], previous + nums[i]);

            if (temp > result) {
                result = temp;
            }

            previous = temp;
        }

        return result;
    }
}
