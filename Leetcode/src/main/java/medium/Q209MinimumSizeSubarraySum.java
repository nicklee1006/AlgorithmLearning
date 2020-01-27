package medium;

public class Q209MinimumSizeSubarraySum {
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // result
        int result = Integer.MAX_VALUE;

        // 2 pointers
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < nums.length) {
            // moving right pointer forward until sum >= s
            sum += nums[right];
            right++;

            // if sum >= s, start moving left forward until sum < s
            while (sum >= s) {
                result = Math.min(result, right - left);

                sum -= nums[left];
                left++;
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
