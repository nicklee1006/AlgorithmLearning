package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.6.5 Question 496. Next Greater Element I
 * https://leetcode.com/problems/next-greater-element-i/description/
 *
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 *
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does
 * not exist, output -1 for this number.
 */
public class Q496NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] results = new int[nums1.length];
        Map<Integer, Integer> indexs = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            indexs.put(nums2[i], i);
        }

        for (int i = 0; i < nums1.length; i++) {
            int index = indexs.get(nums1[i])+1;
            int minIndex = -1;

            while (index < nums2.length) {
                if (nums2[index] > nums1[i]) {
                    minIndex = index;
                    break;
                }

                index++;
            }

            if (minIndex == -1) {
                results[i] = -1;
            } else {
                results[i] = nums2[index];
            }
        }

        return results;
    }
}
