package medium;

import java.util.ArrayList;
import java.util.List;

public class Q89GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> results = new ArrayList<>();
        results.add(0);

        for (int i = 0; i < n; i++) {
            int add = (int) Math.pow(2, i);

            for (int j = results.size() - 1; j >= 0; j--) {
                results.add(results.get(j) + add);
            }
        }
        
        return results;
    }
}
