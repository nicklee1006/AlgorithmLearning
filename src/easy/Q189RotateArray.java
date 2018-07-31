package easy;

/**
 * 2018.4.27 Question 189 Rotate Array
 * https://leetcode.com/problems/rotate-array/description/
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this
 * problem.
 * Could you do it in-place with O(1) extra space?
 *
 * hint: nums = [1,2,3,4,5,6,7] and k = 3, first we reverse [1,2,3,4], it becomes[4,3,2,1];
 *       then we reverse[5,6,7], it becomes[7,6,5], finally we reverse the array as a whole,
 *       it becomes[4,3,2,1,7,6,5] ---> [5,6,7,1,2,3,4].
 *
 * Solution:
 * 1. Reverse the first length-k part
 * 2. Reverse the second k part
 * 3. Reverse the whole
 */
public class Q189RotateArray {
    public static void rotate(int[] nums, int k) {
        // avoid array index out of bound
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1 - k);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

        for (int temp : nums) {
            System.out.println(temp);
        }
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp;

            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}
