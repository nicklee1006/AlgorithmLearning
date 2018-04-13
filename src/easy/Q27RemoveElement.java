package easy;

/**
 * 2018.3.23
 * Question 27: Remove Element
 * https://leetcode.com/problems/remove-element/description/
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
