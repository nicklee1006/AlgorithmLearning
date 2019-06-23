package leetcode.easy;

/**
 * 2018.3.23 Question 27: Remove Element
 * https://leetcode.com/problems/remove-element/description/
 *
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place
 * with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * Solution:
 * 1. Maintain an index of the length of the result
 * 2. Use that index to indicate the place to put values
 */
public class Q27RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }

        return result;
    }
}
