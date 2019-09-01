package medium;

import java.util.ArrayList;
import java.util.List;

public class Q77Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), n, k, 1);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int n, int k, int start) {
        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i <= n; i++) {
            if (tempList.contains(i)) {
                continue;
            }

            tempList.add(i);

            backtrack(result, tempList, n, k, i + 1);

            tempList.remove(tempList.size() - 1);
        }
    }
}
