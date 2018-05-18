package easy;

import java.util.ArrayList;

/**
 * Question 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * <p>
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class Q350IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> numsList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int temp : nums1) {
            numsList.add(temp);
        }

        for (int temp : nums2) {
            if (numsList.contains(temp)) {
                result.add(temp);

                numsList.remove(numsList.indexOf(temp));
            }
        }

        return result.stream().mapToInt(Number::intValue).toArray();
    }
}
