package easy;

import java.util.Arrays;

/**
 * 2018.5.13 Question 268. Missing Number
 * https://leetcode.com/problems/missing-number/description/
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is
 * missing from the array.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only
 * constant extra space complexity?
 *
 * hint:
 * https://leetcode.com/problems/missing-number/discuss/69786/3-different-ideas:-XOR-SUM-Binary-Search.-Java-code
 */
public class Q268MissingNumber {
    public static int missingNumber(int[] nums) {
        boolean[] isAppear = new boolean[nums.length + 1];
        Arrays.fill(isAppear, false);

        for (int temp : nums) {
            isAppear[temp] = true;
        }

        for (int i = 0; i < isAppear.length; i++) {
            if (!isAppear[i]) {
                return i;
            }
        }

        return 0;
    }
}
