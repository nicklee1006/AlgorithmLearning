package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q229MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> results = new ArrayList<>();

        for (int num : nums) {
            int count = map.getOrDefault(num, 0);

            // already have > n/3 count
            if (count == nums.length / 3) {
                results.add(num);
            }

            // we can have at most 2 numbers in the result
            // or some number's count >= 2/3 of total
            if (count == nums.length * 2 / 3 || results.size() == 2) {
                break;
            }

            map.put(num, count + 1);
        }

        return results;
    }
}
