package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.7.2  Question 696. Count Binary Substrings
 * https://leetcode.com/problems/degree-of-an-array/description/
 *
 * Given a non-empty array of non-negative integers nums, the degree of this array is defined as the
 * maximum frequency of any one of its elements.
 *
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the
 * same degree as nums.
 */
public class Q697DegreeOfAnArray {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> start = new HashMap<>();
        Map<Integer, Integer> end = new HashMap<>();

        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!count.containsKey(nums[i])) {
                count.put(nums[i], 0);
                start.put(nums[i], i);
            }

            end.put(nums[i], i);
            count.put(nums[i], count.get(nums[i]) + 1);

            degree = Math.max(degree, count.get(nums[i]));
        }

        int min = Integer.MAX_VALUE;
        for (Integer temp : count.keySet()) {
            if (count.get(temp) == degree) {
                min = Math.min(min, end.get(temp) - start.get(temp) + 1);
            }
        }

        return min;
    }
}
