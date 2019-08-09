package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.5.7 Question 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * Given an array of integers, find if the array contains any duplicates.
 *
 * Your function should return true if any value appears at least twice in the array, and it should
 * return false if every element is distinct.
 *
 * Solution
 * 1. Use map to store previous met number
 * 2. Or just use Set?
 */
public class Q217ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int temp : nums) {
            if (!count.containsKey(temp)) {
                count.put(temp, 1);
            } else {
                return true;
            }
        }

        return false;
    }
}
