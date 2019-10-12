package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018.4.15 Pascal's Triangle II
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * Given an index kth, return the kth row of the Pascal's triangle.
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 * Solution
 * 1. Same as Q118
 */
public class Q119PascalTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex);

        if (rowIndex < 0) {
            return result;
        }

        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(0, 1);

            for (int j = 1; j < result.size() - 1; j++) {
                result.set(j, result.get(j) + result.get(j + 1));
            }
        }

        return result;
    }
}
