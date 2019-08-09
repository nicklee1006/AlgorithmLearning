package leetcode.easy;

/**
 * 2018.3.22 Question 26: Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and
 * return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with
 * O(1) extra memory.
 */
public class Q26RemoveDuplicatesFromSortedArray {
    /**
     * 1. loop array
     *  1.1 maintain an index of the length of result
     *  1.2 if current value != next value, give current value to result[index-1]
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int result = 1;
        int current = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            if (current != nums[i + 1]) {
                nums[result - 1] = current;
                result++;
                current = nums[i + 1];
            }
        }

        return result;
    }
}
