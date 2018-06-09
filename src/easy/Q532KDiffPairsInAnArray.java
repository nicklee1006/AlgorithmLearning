package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.6.9 Question 532. K-diff Pairs in an Array
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 *
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs
 * in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the
 * array and their absolute difference is k.
 *
 * Note:
 * The pairs (i, j) and (j, i) count as the same pair.
 * The length of the array won't exceed 10,000.
 * All the integers in the given input belong to the range: [-1e7, 1e7].
 */
public class Q532KDiffPairsInAnArray {
    public static int findPairs(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> count = new HashMap<>();

        if (k < 0) {
            return 0;
        }

        // count number appearance
        for (int temp : nums) {
            count.put(temp, count.getOrDefault(temp, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    result++;
                }
            } else {
                if (count.containsKey(entry.getKey() + k)) {
                    result++;
                }
            }
        }

        return result;
    }
}
