package easy;

/**
 * 2018.5.13 Question 283. Move Zeroes
 * https://leetcode.com/problems/move-zeroes/description/
 *
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * Solution
 * 1. Use another pointer to indicate how many non-zeros
 * 2. All after index set to 0
 */
public class Q283MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
