package easy;

/**
 * 2018.7.6 Question 747. Largest Number At Least Twice of Others
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/
 * <p>
 * In a given integer array nums, there is always exactly one largest element.
 * <p>
 * Find whether the largest element in the array is at least twice as much as every other number in
 * the array.
 * <p>
 * If it is, return the index of the largest element, otherwise return -1.
 */
public class Q747LargestNumberAtLeastTwiceOfOthers {
    public static int dominantIndex(int[] nums) {
        int index = 0;
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                index = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        return max1 >= max2 * 2 ? index : -1;
    }
}
