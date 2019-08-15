package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q47PermutationsII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        backtrack(nums, new ArrayList<>(), new ArrayList<>(), result);

        return result;
    }

    private static void backtrack(int[] nums, List<Integer> tempList, List<Integer> indexList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        }

        for (int i = 0; i < nums.length; i++) {
            // already have the elements added
            if (indexList.contains(i)) {
                continue;
            }

            // remove duplicates
            if (i > 0 && !indexList.contains(i - 1) && nums[i - 1] == nums[i]) {
                continue;
            }

            indexList.add(i);
            tempList.add(nums[i]);

            backtrack(nums, tempList, indexList, result);

            indexList.remove(indexList.size() - 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
