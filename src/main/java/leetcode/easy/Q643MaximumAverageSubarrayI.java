package leetcode.easy;

/**
 * 2018.6.21 Question 643. Maximum Average Subarray I
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 *
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the
 * maximum average value. And you need to output the maximum average value.
 *
 * Solution
 * 1. get the average of first k elements
 * 2. use for loop, remove previous number and add current element
 * 3. get the max
 */
public class Q643MaximumAverageSubarrayI {
    public static double findMaxAverage(int[] nums, int k) {
        int result = 0;

        // initial
        for (int i = 0; i < k; i++) {
            result += nums[i];
        }

        int prev = result;
        for (int i = k; i < nums.length; i++) {
            int temp = prev - nums[i - k] + nums[i];

            result = Math.max(result, temp);
            prev = temp;
        }

        return result * 1.0 / k;
    }
}
