package leetcode.easy;

import java.util.Arrays;

/**
 * 2018.6.15 Question 581. Shortest Unsorted Continuous Subarray
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/
 *
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in
 * ascending order, then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Solution
 * 1. Sort the array and copy to another
 * 2. Compare with original, find the begin and end index that original and sorted are different
 */
public class Q581ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        int begin = 0;
        int end = nums.length - 1;

        while (begin < nums.length && nums[begin] == sorted[begin]) {
            begin++;
        }

        while (begin < end && nums[end] == sorted[end]) {
            end--;
        }

        return end - begin + 1;
    }
}
