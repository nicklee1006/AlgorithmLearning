package medium;

public class Q300LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        int result = 1;

        // loop all numbers
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;

            // check all numbers before nums[i]
            for (int j = 0; j < i; j++) {
                // if nums[j] < nums[i], means we could contact nums[i] with nums[j]
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }

            result = Math.max(result, dp[i]);
        }

        return result;
    }
}
