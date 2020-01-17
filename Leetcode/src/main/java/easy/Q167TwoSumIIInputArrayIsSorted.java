package easy;

/**
 * 2018.4.23 Question 167. Two Sum II - Input array is sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they
 * add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2)
 * are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element
 * twice.
 *
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 * hint:
 * make use of the sorted array!
 *
 * Solution
 * 1. Two pointers, start and end
 */
public class Q167TwoSumIIInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        // use 2 pointers
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            // find the target
            if (numbers[start] + numbers[end] == target) {
                break;
            }

            // sum not big enough, increase start
            if (numbers[start] + numbers[end] < target) {
                start++;
            // sum to large, decrease end
            } else {
                end--;
            }
        }

        return new int[]{start + 1, end + 1};
    }
}
