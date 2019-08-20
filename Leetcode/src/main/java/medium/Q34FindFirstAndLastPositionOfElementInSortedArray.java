package medium;

public class Q34FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int[] result = new int[]{-1, -1};

        if (nums.length == 0) {
            return result;
        }

        // first, try to find target, and keep search left part
        // when this loop exit, start must point to the leftmost target, or target not exist
        while (start <= end) {
            int mid = (start + end) / 2;

            // find target, keep search left
            if (nums[mid] == target) {
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start == nums.length || nums[start] != target) {
            return result;
        } else {
            result[0] = start;
        }

        // search rightmost target
        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // find target, keep search right part
            if (nums[mid] == target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // we already know that target exist
        // end will convergence to target
        result[1] = end;

        return result;
    }
}
