package medium;

public class Q153FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        // use binary search
        // start, mid, end
        // compare mid and start
        // if mid < end, means right half is sorted, min value must be in left half
        // if mid > end, means array must pivot at some value in the right half, thus min in the right half
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}
