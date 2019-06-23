package leetcode.easy;

import java.util.Arrays;

/**
 * 2018.6.1 Question 475 Heaters
 * https://leetcode.com/problems/heaters/description/
 *
 * Winter is coming! Your first job during the contest is to design a standard heater with
 * fixed warm radius to warm all the houses.
 *
 * Now, you are given positions of houses and heaters on a horizontal line, find out minimum
 * radius of heaters so that all houses could be covered by those heaters.
 *
 * So, your input will be the positions of houses and heaters seperately, and your expected
 * output will be the minimum radius standard of heaters.
 *
 * Note:
 * Numbers of houses and heaters you are given are non-negative and will not exceed 25000.
 * Positions of houses and heaters you are given are non-negative and will not exceed 10^9.
 * As long as a house is in the heaters' warm radius range, it can be warmed.
 * All the heaters follow your radius standard and the warm radius will the same.
 *
 * Solution
 * 1. Sort house and heaters
 * 2. For each house, find it's closest heater distance
 * 3. Return the max distance
 */
public class Q475Heaters {
    public static int findRadius(int[] houses, int[] heaters) {
        int result = Integer.MIN_VALUE;

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int heaterIndex = 0;
        for (int house : houses) {
            while (heaterIndex < heaters.length - 1 && (Math.abs(heaters[heaterIndex+1] - house) <= Math.abs(heaters[heaterIndex] - house))){
                heaterIndex ++;
            }

            result = Math.max(result, Math.abs(house - heaters[heaterIndex]));
        }

        return result;
    }
}
