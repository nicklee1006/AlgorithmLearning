package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2018.5.17 Question 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 *
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 *
 * Solution
 * 1. first insert num1 into set
 * 2. check num2, if set contains same number, insert to results
 */
public class Q349IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1Set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int temp : nums1) {
            num1Set.add(temp);
        }

        for (int temp : nums2) {
            if (num1Set.contains(temp)) {
                result.add(temp);
            }
        }

        // convert set to array
        return result.stream().mapToInt(Number::intValue).toArray();
    }
}
