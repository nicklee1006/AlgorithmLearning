package easy;

/**
 * 2018.6.24 Question 665. Non-decreasing Array
 * https://leetcode.com/problems/non-decreasing-array/description/
 *
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at
 * most 1 element.
 *
 * We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 *
 * hint:
 * https://leetcode.com/problems/non-decreasing-array/discuss/106826/JavaC++-Simple-greedy-like-solution-with-explanation
 *
 * Solution
 * 1. Don't understand*****
 */
public class Q665NonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;

                if (count >= 2) {
                    return false;
                }

                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return true;
    }
}
