package medium;

public class Q55JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int furthest = 0;
        int index = 0;

        while (index < nums.length) {
            furthest = Math.max(furthest, nums[index] + index);

            index++;

            if (index > furthest) {
                return false;
            }

            if (furthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}
