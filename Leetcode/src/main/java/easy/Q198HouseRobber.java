package easy;

/**
 * 2018.4.30 Question 198. House Robber
 * https://leetcode.com/problems/house-robber/description/
 *
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount
 * of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses
 * have security system connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine the
 * maximum amount of money you can rob tonight without alerting the police.
 *
 * Solution
 * 1. Keep track of rob current one and not rob
 */
public class Q198HouseRobber {
    public static int rob(int[] nums) {
        // max money if rob current one
        int robCurrent = 0;
        // max money if not rob current one
        int notRobCurrent = 0;

        for (int i = 0; i < nums.length; i++) {
            // if rob current one, previous one must not rob
            int ifRobCurrent = notRobCurrent + nums[i];

            // not rob this one, take max of rob (i-1) house and not rob (i-1) house
            notRobCurrent = Math.max(robCurrent, notRobCurrent);
            // rob current one
            robCurrent = ifRobCurrent;
        }

        return Math.max(robCurrent, notRobCurrent);
    }
}
