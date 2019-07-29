package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q184Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // to avoid duplicate
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                for (int j = i + 1; j < nums.length; j++) {
                    // to avoid duplicate
                    if (j == i + 1 || (j > 0 && nums[j] != nums[j - 1])) {
                        int low = j + 1;
                        int high = nums.length - 1;

                        int sum = target - nums[i] - nums[j];

                        while (low < high) {
                            if (nums[low] + nums[high] == sum) {
                                results.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));

                                low++;
                                high--;

                                while (low < high && nums[low] == nums[low - 1]) {
                                    low++;
                                }

                                while (low < high && nums[high] == nums[high + 1]) {
                                    high--;
                                }
                            } else if (nums[low] + nums[high] > sum) {
                                high--;
                            } else {
                                low++;
                            }
                        }
                    }
                }
            }
        }

        return results;
    }
}
