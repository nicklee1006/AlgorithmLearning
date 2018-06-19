package easy;

import java.util.Arrays;

/**
 * 2018.6.19 Question 628. Maximum Product of Three Numbers
 * https://leetcode.com/problems/maximum-product-of-three-numbers/description/
 * <p>
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.
 * <p>
 * Note:
 * The length of the given array will be in range [3,10^4] and all elements are in the range [-1000, 1000].
 * Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */
public class Q628MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int result1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int result2 = nums[0] * nums[1] * nums[nums.length - 1];

        return result1 > result2 ? result1 : result2;
    }
}
