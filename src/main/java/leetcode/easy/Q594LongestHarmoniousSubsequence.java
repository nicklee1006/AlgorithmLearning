package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.6.15 Question 594. Longest Harmonious Subsequence
 * https://leetcode.com/problems/longest-harmonious-subsequence/description/
 *
 * We define a harmonious array is an array where the difference between its maximum value and its minimum
 * value is exactly 1.
 *
 * Now, given an integer array, you need to find the length of its longest harmonious subsequence among all
 * its possible subsequences.
 *
 * Solution
 * 1. use Hashmap to count number and it's occurrences
 * 2. For all keys, find max (count.get(key) + count.get(key+1))
 */
public class Q594LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int temp : nums) {
            count.put(temp, count.getOrDefault(temp, 0) + 1);
        }

        int result = 0;

        for (int key : count.keySet()) {
            if (count.containsKey(key + 1)) {
                result = Math.max(result, count.get(key) + count.get(key + 1));
            }
        }

        return result;
    }
}
