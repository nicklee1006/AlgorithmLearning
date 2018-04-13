package easy;

/**
 * 2018.3.25
 * Question 35: Search Insert Position
 * https://leetcode.com/problems/search-insert-position
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
