package leetcode.easy;

/**
 * 2018.6.4 Question 485. Max Consecutive Ones
 * https://leetcode.com/problems/max-consecutive-ones/description/
 *
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * Note:
 *
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 *
 * Solution
 * 1. for loop, if num[n] and num[n-1] all = 1, count++
 * 2. if only num[n] = 1, reset count = 1
 */
public class Q485MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;

        if (nums[0] == 1) {
            temp = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1 && nums[i - 1] == 1) {
                temp++;
            } else if (nums[i] == 1) {
                temp = 1;
            } else {
                result = Math.max(result, temp);
                temp = 0;
            }
        }

        result = Math.max(result, temp);

        return result;
    }
}
