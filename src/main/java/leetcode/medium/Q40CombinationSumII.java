package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q40CombinationSumII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();

        // sort to remove duplicates
        Arrays.sort(candidates);

        backtrack(results, new ArrayList<>(), candidates, target, 0);

        return results;
    }

    private static void backtrack(List<List<Integer>> results,
                                  List<Integer> tempList,
                                  int[] candidates,
                                  int remaining, int start) {
        if (remaining < 0) {
            return;
        } else if (remaining == 0) {
//            List<Integer> tempResult = new ArrayList<>(tempList);
//
//            for (List<Integer> result : results) {
//                if (result.size() == tempResult.size() && twoListEquals(result, tempResult)) {
//                    return;
//                }
//            }

            results.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                // skip same number
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }

                tempList.add(candidates[i]);

                backtrack(results, tempList, candidates, remaining - candidates[i], i + 1);

                // find solution or remaining < 0, backtrack one number in the list
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    // assume same size
//    private static boolean twoListEquals(List<Integer> list1, List<Integer> list2) {
//        List<Integer> list1Copy = new ArrayList<>(list1);
//
//        for (Integer integer : list2) {
//            if (!list1Copy.contains(integer)) {
//                return false;
//            } else {
//                list1Copy.remove(integer);
//            }
//        }
//
//        return true;
//    }
}
