package medium;

import java.util.TreeSet;

public class Q220ContainsDuplicateIII {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> numberSet = new TreeSet<>();

        // construct a sliding window
        // window contains `k` elements
        for (int i = 0; i < nums.length; i++) {
            // need to remove item from the window
            if (i > k) {
                numberSet.remove((long)nums[i - k - 1]);
            }

            // if current element is nums[i], try to find the min element in the window >= nums[i] - t
            // if the min element <= nums[i] + t, then we found the number
            Long temp = numberSet.ceiling((long)nums[i] - t);

            if (temp != null && temp <= (long)nums[i] + t) {
                return true;
            }

            numberSet.add((long)nums[i]);
        }

        return false;
    }
}
