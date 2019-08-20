package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2018.3.14
 * Question 1: Two Sum
 * https://leetcode.com/problems/two-sum/description/
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class Q1TwoSum {
    /**
     *  Put previous visited number into a map, so when visit later number, can used previous number.
     *  No need to have two for loops
     */
    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> input = new HashMap<>();

        for (int i = 0;i < nums.length;i++) {
            if (input.containsKey(target - nums[i])) {
                result[0] = input.get(target - nums[i]);
                result[1] = i;
                break;
            }

            input.put(nums[i], i);
        }

        Arrays.sort(result);

        return result;
    }
}
