package medium;

import java.util.ArrayList;
import java.util.List;

public class Q216CombinationSumIII {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();

        getResult(result, new ArrayList<>(), k, n, 1);

        return result;
    }

    private static void getResult(List<List<Integer>> result, List<Integer> temp, int k, int n, int start) {
        // if reach the length and remaining is 0
        if (temp.size() == k) {
            if (n == 0) {
                result.add(new ArrayList<>(temp));
            }

            return;
        }

        for (int i = start; i < 10; i++) {
            temp.add(i);
            getResult(result, temp, k, n - i, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
