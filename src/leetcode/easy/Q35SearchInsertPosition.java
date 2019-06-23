package leetcode.easy;

/**
 * 2018.3.25 Question 35: Search Insert Position
 * https://leetcode.com/problems/search-insert-position
 *
 * Given a sorted array and a target value, return the index if the target is found. If not, return the
 * index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Solution
 * 1. find the index that first num[i] >= target
 */
public class Q35SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
