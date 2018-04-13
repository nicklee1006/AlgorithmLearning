package easy;

/**
 * 2018.3.22
 * Question 26: Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Q26RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int result = 1;
        int current = nums[0];

        for (int i = 0; i < nums.length-1; i++) {
            if (current != nums[i + 1]) {
                nums[result-1] = current;
                result++;
                current = nums[i + 1];
            }
        }

        return result;
    }
}
