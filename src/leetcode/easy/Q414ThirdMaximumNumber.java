package leetcode.easy;

/**
 * 2018.5.24 Question 414. Third Maximum Number
 * https://leetcode.com/problems/third-maximum-number/description/
 *
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * Solution
 * 1. One loop
 * 2. max1, max2, max3
 * 3. keep fill max1, 2, 3
 * 4. return max3 or max1
 */
public class Q414ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer temp : nums) {
            if (temp.equals(max1) || temp.equals(max2) || temp.equals(max3)) {
                continue;
            }

            // greater than biggest value
            if (max1 == null || temp > max1) {
                max3 = max2;
                max2 = max1;
                max1 = temp;
            } else if (max2 == null || temp > max2) {
                max3 = max2;
                max2 = temp;
            } else if (max3 == null || temp > max3) {
                max3 = temp;
            }
        }

        return max3 == null ? max1 : max3;
    }
}
