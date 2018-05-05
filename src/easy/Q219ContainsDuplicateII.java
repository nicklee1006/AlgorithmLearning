package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.5.7 Question 219. Contains Duplicate II
 *
 * Given an array of integers and an integer k, find out whether there are two distinct indices i
 * and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at
 * most k.
 */
public class Q219ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = indices.put(nums[i], i);

            if (index != null && ((i - index) <= k)) {
                return true;
            }
        }

        return false;
    }
}
