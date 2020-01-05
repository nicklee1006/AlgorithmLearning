package medium;

public class Q55JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int furthest = 0;
        int index = 0;

        while (index < nums.length) {
            // the furthest from the current and previous position
            furthest = Math.max(furthest, nums[index] + index);

            index++;

            // if this position can't be reached
            if (index > furthest) {
                return false;
            }

            // already reach the end
            if (furthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}
