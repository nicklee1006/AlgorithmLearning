package medium;

public class Q81SearchInRotatedSortedArrayII {
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // find target
            if (target == nums[mid]) {
                return true;
            }

            // left side is ordered
            if (nums[start] < nums[mid]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            // special case like [1, 3, 1]
            } else if (nums[start] == nums[mid]) {
                start++;
            } else {
                // right side is ordered
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}
