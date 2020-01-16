package medium;

public class Q152MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int result = 0;

        if (nums.length == 0) {
            return result;
        }

        // need to keep a record of max product and min product ending at index i
        // want to keep min because if current < 0, we want min * current become large if min < 0
        int preMax = nums[0];
        int preMin = nums[0];

        result = preMax;

        for (int i = 1; i < nums.length; i++) {
            // 3 conditions
            //  1 - nums[i] >= 0 and preMax > 0
            //      then we update preMax = preMax * num[i]
            //  2 - nums[i] >= 0 and preMax < 0
            //      then we update preMax = nums[i]
            //  3 - nums[i] < 0
            //      then if preMin < 0, then update preMax = preMin * nums[i]
            //           else preMax = nums[i]
            // we can see there are 3 possible values: preMax * num[i], nums[i], preMin * nums[i]
            int tempMax = preMax;

            preMax = Math.max(preMax * nums[i], Math.max(nums[i], preMin * nums[i]));
            preMin = Math.min(tempMax * nums[i], Math.min(nums[i], preMin * nums[i]));

            result = Math.max(preMax, result);
        }

        return result;
    }
}
