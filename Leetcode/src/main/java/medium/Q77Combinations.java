package medium;

import java.util.ArrayList;
import java.util.List;

public class Q77Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), n, k, 1);

        return result;
    }

    // similar to permutation
    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int n, int k, int start) {
        // find a solution, add to result list
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i <= n; i++) {
            // avoid duplicates
            if (tempList.contains(i)) {
                continue;
            }

            // add current number in
            tempList.add(i);

            // add other numbers in
            backtrack(result, tempList, n, k, i + 1);

            // all possible number has been added, remove last number and start
            tempList.remove(tempList.size() - 1);
        }
    }
}
