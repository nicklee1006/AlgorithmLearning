package medium;

import java.util.*;

public class Q90SubsetsII {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();

        // add empty list
        results.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> existing : results) {
                List<Integer> newListAppend = new ArrayList<>(existing);
                newListAppend.add(num);

                Collections.sort(newListAppend);

                temp.add(newListAppend);
            }

            results.addAll(temp);
        }

        return new ArrayList<>(results);
    }
}
