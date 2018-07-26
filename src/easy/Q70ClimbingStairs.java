package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.4.2: Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/description/
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top.
 * Note: Given n will be a positive integer.
 *
 * Solution:
 * 1. Dynamic Programming, c(n) = c(n-1) + c(n-2)
 */
public class Q70ClimbingStairs {
    static Map<Integer, Integer> tempResult = new HashMap<>();

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int result;
        if (tempResult.containsKey(n)) {
            return tempResult.get(n);
        } else {
            result = climbStairs(n - 1) + climbStairs(n - 2);
            tempResult.put(n, result);
        }

        return result;
    }
}
