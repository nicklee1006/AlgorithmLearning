package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1;
            int high = nums.length - 1;

            int target = -nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == target) {
                    results.add(Arrays.asList(nums[low], nums[high], nums[i]));

                    low++;
                    high--;

                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }

                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (nums[low] + nums[high] > target) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return results;
    }

    /**
     * make use of 2 sum.
     */
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> results = new ArrayList<>();
//
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            temp.clear();
//            for (int j = 0; j < nums.length; j++) {
//                if (j == i) {
//                    continue;
//                }
//
//                if (temp.contains(-nums[i] - nums[j])) {
//                    // find, check duplicate
//                    if (!alreadyExist(results, Arrays.asList(nums[i], nums[j], -nums[i] - nums[j]))) {
//                        results.add(Arrays.asList(nums[i], nums[j], -nums[i] - nums[j]));
//                    }
//                }
//
//                temp.add(nums[j]);
//            }
//        }
//
//        return results;
//    }

//    private static boolean alreadyExist(List<List<Integer>> results, List<Integer> toAdd) {
//        Collections.sort(toAdd);
//
//        for (List<Integer> temp : results) {
//            Collections.sort(temp);
//
//            if (temp.equals(toAdd)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
}
