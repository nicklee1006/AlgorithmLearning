package medium;

import java.util.HashMap;
import java.util.Map;

public class Q137SingleNumberII {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        for (Integer key : count.keySet()) {
            if (count.get(key) == 1) {
                return key;
            }
        }

        return  -1;
    }
}
