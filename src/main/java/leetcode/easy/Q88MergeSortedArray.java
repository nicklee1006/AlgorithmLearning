package leetcode.easy;

/**
 * 2018.4.4 Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/description/
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional
 * elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 * Solution
 * 1. Merge from backwards
 * 2. take care when there is any num2 left
 */
public class Q88MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // move all m elements in num1 to the end of nums1
        for (int i = 0; i < m; i++) {
            nums1[m + n - 1 - i] = nums1[m - 1 - i];
        }

        int index = 0;
        int indexNum1 = n;
        int indexNum2 = 0;

        while (indexNum2 < n) {
            // if empty num1, insert all num2
            if (indexNum1 == m + n) {
                while (indexNum2 < n) {
                    nums1[index++] = nums2[indexNum2++];
                }

                return;
            }

            if (nums1[indexNum1] <= nums2[indexNum2]) {
                nums1[index] = nums1[indexNum1++];
            } else {
                nums1[index] = nums2[indexNum2++];

            }
            index++;
        }
    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int index1 = m - 1;
//        int index2 = n - 1;
//        int indexMerge = m + n - 1;
//
//        while (index1 >= 0 && index2 >= 0) {
//            if (nums1[index1] > nums2[index2]) {
//                nums1[indexMerge] = nums1[index1];
//                indexMerge--;
//                index1--;
//            } else {
//                nums1[indexMerge] = nums2[index2];
//                indexMerge--;
//                index2--;
//            }
//        }
//
//        while (index2 >= 0) {
//            nums1[indexMerge] = nums2[index2];
//            indexMerge--;
//            index2--;
//        }
//    }
}
