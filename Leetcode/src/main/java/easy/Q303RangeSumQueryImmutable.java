package easy;

/**
 * 2018.5.15 Question 303. Range Sum Query - Immutable
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 *
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * Note:
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 *
 * Solution
 * 1.
 */
public class Q303RangeSumQueryImmutable {
    private int[] numsSum;

    public Q303RangeSumQueryImmutable(int[] nums) {
        numsSum = new int[nums.length];

        if (nums.length != 0) {
            numsSum[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                numsSum[i] += numsSum[i-1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (j == 0) {
            return numsSum[0];
        }

        if (i == 0) {
            return numsSum[j];
        } else {
            return numsSum[j] - numsSum[i-1];
        }
    }
}
