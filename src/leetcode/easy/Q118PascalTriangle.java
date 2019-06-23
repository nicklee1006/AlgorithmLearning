package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018.4.14 Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * Solution
 * 1. add first and second row by default
 * 2. Construct by rule, R(n-i) = R((n-1)-i) + R((n-1)-(i-1))
 */
public class Q118PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> results = new ArrayList<>();

        if (numRows == 0) {
            return results;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        results.add(firstRow);

        if (numRows == 1) {
            return results;
        }

        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);

        results.add(second);

        if (numRows == 2) {
            return results;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    newRow.add(1);
                    continue;
                }

                newRow.add(results.get(i - 1).get(j - 1) + results.get(i - 1).get(j));
            }

            results.add(newRow);
        }

        return results;
    }
}
