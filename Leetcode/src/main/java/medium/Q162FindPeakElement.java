package medium;

public class Q162FindPeakElement {
    public static int findPeakElement(int[] nums) {
        // binary search
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            // peak ub left part
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            // peak in right part
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
