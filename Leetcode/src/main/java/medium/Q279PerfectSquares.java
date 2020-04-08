package medium;

import java.util.HashMap;
import java.util.Map;

public class Q279PerfectSquares {
    private static Map<Integer, Integer> records = new HashMap<>();

    public static int numSquares(int n) {
        return helper(n, records);
    }

    private static int helper(int n, Map<Integer, Integer> records) {
        if (records.containsKey(n)) {
            return records.get(n);
        }

        if (n == 0) {
            return 0;
        }
        
        int count = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            count = Math.min(count, helper(n - i * i, records) + 1);
        }

        records.put(n, count);

        return count;
    }
}
