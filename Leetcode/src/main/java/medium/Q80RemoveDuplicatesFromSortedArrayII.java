package medium;

public class Q80RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast;
        // count to mark number of same number
        int count = 1;

        // fast pointer always increase
        for (fast = 1; fast < nums.length; fast++) {
            if (nums[slow] == nums[fast]) {
                // 2 pointers point to same number, but count = 1
                // increase slow pointer
                if (count < 2) {
                    slow++;
                    nums[slow] = nums[fast];
                    count++;
                }
            // 2 pointers point to different number
            // reset count = 1
            } else {
                slow++;
                nums[slow] = nums[fast];
                count = 1;
            }
        }

        return slow + 1;
    }
}
