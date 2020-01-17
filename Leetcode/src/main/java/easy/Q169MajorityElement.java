package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.4.25: Question 169. Majority Element
 * https://leetcode.com/problems/majority-element/description/
 * <p>
 * Given an array of size n, find the majority element. The majority element is the element that appears
 * more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * Solution
 * 1. Use Hashmap to store the count of each element
 * 2. Sort the array, then the majority must be [n/2]-th element?
 */
public class Q169MajorityElement {
    public static int majorityElement(int[] nums) {
        int majority = 0;
        // counting of each element
        Map<Integer, Integer> result = new HashMap<>();

        for (int temp : nums) {
            if (result.containsKey(temp)) {

                result.put(temp, result.get(temp) + 1);
            } else {
                result.put(temp, 1);
            }

            // once there is an element take the majority
            if (result.get(temp) > nums.length / 2) {
                majority = temp;
            }
        }

        return majority;
    }
}
