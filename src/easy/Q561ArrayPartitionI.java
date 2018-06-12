package easy;

import java.util.Arrays;

/**
 * 2018.6.12 Question 561. Array Partition I
 * https://leetcode.com/problems/array-partition-i/description/
 *
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1),
 * (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */
public class Q561ArrayPartitionI {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int result = 0;

        for (int i = 0; i < nums.length; i = i+2) {
            result += nums[i];
        }

        return result;
    }
}
