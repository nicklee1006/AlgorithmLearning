package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q46Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        // find a solution, add to result
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        }

        for (int num : nums) {
            // if already have the number, skip
            if (tempList.contains(num)) {
                continue;
            }

            tempList.add(num);

            // continue adding next one
            backtrack(result, tempList, nums);

            // remove the last added one
            tempList.remove(tempList.size() - 1);
        }
    }
}
