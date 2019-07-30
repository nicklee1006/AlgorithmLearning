package leetcode.medium;

import java.util.Arrays;

public class Q16ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int distance = Integer.MAX_VALUE;
        int result = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int tempSum = nums[i] + nums[low] + nums[high];
                if (tempSum == target) {
                    return tempSum;
                } else if (tempSum > target) {
                    high--;
                } else {
                    low++;
                }

                if (Math.abs(tempSum - target) < distance) {
                    distance = Math.abs(tempSum - target);
                    result = tempSum;
                }
            }
        }

        return result;
    }
}
