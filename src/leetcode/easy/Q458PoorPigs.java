package leetcode.easy;

/**
 * 2018.5.30 Question 458. Poor Pigs
 * https://leetcode.com/problems/poor-pigs/description/
 *
 * There are 1000 buckets, one and only one of them contains poison, the rest are filled with
 * water. They all look the same. If a pig drinks that poison it will die within 15 minutes.
 * What is the minimum amount of pigs you need to figure out which bucket contains the poison
 * within one hour.
 *
 * Answer this question, and write an algorithm for the follow-up general case.
 *
 * Follow-up:
 *
 * If there are n buckets and a pig drinking poison will die within m minutes, how many pigs
 * (x) you need to figure out the "poison" bucket within p minutes? There is exact one bucket
 * with poison.
 *
 * hint:
 * https://leetcode.com/problems/poor-pigs/discuss/94266/Another-explanation-and-solution
 *
 * Solution
 * 1.*****don't understand
 */
public class Q458PoorPigs {
    public static int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;

        while (Math.pow(minutesToTest / minutesToDie + 1, pigs) < buckets) {
            pigs++;
        }

        return pigs;
    }
}