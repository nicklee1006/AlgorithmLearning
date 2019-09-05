package medium;

public class Q80RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast;
        int count = 1;

        for (fast = 1; fast < nums.length; fast++) {
            if (nums[slow] == nums[fast]) {
                if (count < 2) {
                    slow++;
                    nums[slow] = nums[fast];
                    count++;
                }
            } else {
                slow++;
                nums[slow] = nums[fast];
                count = 1;
            }
        }

        return slow + 1;
    }
}
