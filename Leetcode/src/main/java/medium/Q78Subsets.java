package medium;

import java.util.ArrayList;
import java.util.List;

public class Q78Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        // result list
        List<List<Integer>> results = new ArrayList<>();

        // add empty list
        results.add(new ArrayList<>());

        for (int num : nums) {
            // append nums[i] to all existing list
            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> existResult : results) {
                List<Integer> tempResult = new ArrayList<>(existResult);
                tempResult.add(num);

                temp.add(tempResult);
            }

            results.addAll(temp);
        }

        return results;
    }
}
