package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2018.6.7 Question 506. Relative Ranks
 * https://leetcode.com/problems/relative-ranks/description/
 *
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who
 * will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 */
public class Q506RelativeRanks {
    public static String[] findRelativeRanks(int[] nums) {
        String[] results = new String[nums.length];

        int[] rank = new int[nums.length];
        System.arraycopy(nums, 0, rank, 0, nums.length);

        Arrays.sort(rank);

        Map<Integer, Integer> scoreToRank = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            scoreToRank.put(rank[i], nums.length - i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (scoreToRank.get(nums[i]) == 1) {
                results[i] = "Gold Medal";
            } else if (scoreToRank.get(nums[i]) == 2) {
                results[i] = "Silver Medal";
            } else if (scoreToRank.get(nums[i]) == 3) {
                results[i] = "Bronze Medal";
            } else {
                results[i] = String.valueOf(scoreToRank.get(nums[i]));
            }
        }

        return results;
    }
}
