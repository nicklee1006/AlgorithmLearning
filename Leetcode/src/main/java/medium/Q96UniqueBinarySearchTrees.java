package medium;

import java.util.HashMap;
import java.util.Map;

public class Q96UniqueBinarySearchTrees {
    // dynamic programming values
    static Map<Integer, Integer> map = new HashMap<>();

    public static int numTrees(int n) {
        map.put(0, 1);
        map.put(1, 1);
        map.put(2, 2);

        return getAnswer(n);
    }

    private static int getAnswer(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int result = 0;

        for (int i = 1; i <= n; i++) {
            // root element is i, #left = i - i, #right = n - i
            int left;
            if (map.containsKey(i - 1)) {
                left = map.get(i - 1);
            } else {
                left = getAnswer(i - 1);
                map.put(i - 1, left);
            }

            int right;
            if (map.containsKey(n - i)) {
                right = map.get(n - i);
            } else {
                right = getAnswer(n - i);
                map.put(n - i, right);
            }

            result += left * right;
        }

        map.put(n, result);
        return result;
    }
}
