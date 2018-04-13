package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2018.3.14
 * Question 1: Two Sum
 * https://leetcode.com/problems/two-sum/description/
 */
public class Q1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    break;
                }

                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        Arrays.sort(result);

        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> input = new HashMap<>();

        for (int i=0;i<nums.length;i++) {
            if (input.containsKey(target - nums[i])) {
                result[0] = input.get(target-nums[i]);
                result[1] = i;
            }

            input.put(nums[i], i);
        }

        Arrays.sort(result);

        return result;
    }
}
