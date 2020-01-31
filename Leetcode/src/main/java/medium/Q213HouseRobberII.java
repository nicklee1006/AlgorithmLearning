package medium;

public class Q213HouseRobberII {
    public static int rob(int[] nums) {
        // special case
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        // 2 conditions
        // if rob 1st home, then just consider max of (1st, last-1)
        // if not rob 1st home, them consider (2rd, last)
        int max1 = robHelper(nums, 0, nums.length - 1);
        int max2 = robHelper(nums, 1, nums.length);

        return Math.max(max1, max2);
    }

    private static int robHelper(int[] nums, int start, int end) {
        // max if rob previous one
        int ifRobPrevious = 0;
        // max if not rob previous one
        int ifNotRobPrevious = 0;

        for (int i = start; i < end; i++) {
            // if rob current one, then must not rob previous one
            int ifRobCurrent = ifNotRobPrevious + nums[i];

            // if not rob current one, then take max of ifRobPrevious and ifNotRobPrevious
            int ifNotRobCurrent = Math.max(ifRobPrevious, ifNotRobPrevious);

            ifNotRobPrevious = ifNotRobCurrent;
            ifRobPrevious = ifRobCurrent;
        }

        return Math.max(ifRobPrevious, ifNotRobPrevious);
    }
}
