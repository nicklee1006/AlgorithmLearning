package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q60PermutationSequence {
    // record n!, keep it here to speed up
    private static Map<Integer, Integer> factorialTable = new HashMap<>();

    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        return getResult(nums, n, k);
    }

    // nums initially is '1,2,3,4,5,....n'
    private static String getResult(List<Integer> nums, int n, int k) {
        StringBuilder stringBuilder = new StringBuilder();

        while (n > 1) {
            // permutation starting with the same number is a group
            // how many number in each group
            // e.g. if n = 3, each group has 2 numbers
            int numPerGroup = factorial(n - 1);
            // which group is our target number in
            int groupNum = (k - 1) / numPerGroup;

            stringBuilder.append(nums.get(groupNum));

            k = k % numPerGroup;
            k = k == 0 ? numPerGroup : k;

            nums.remove(groupNum);
            n--;
        }

        stringBuilder.append(nums.get(0));

        return stringBuilder.toString();
    }

    private static int factorial(int n) {
        if (n == 1) {
            factorialTable.put(n, 1);
            return 1;
        } else {
            if (factorialTable.containsKey(n - 1)) {
                int result = n * factorialTable.get(n - 1);
                factorialTable.put(n, result);
                return result;
            } else {
                int result = n * factorial(n - 1);
                factorialTable.put(n, result);
                return result;
            }
        }
    }

    // slow approach
//    private int count;
//    private String result;
//
//    public String getPermutation(int n, int k) {
//        count = 1;
//        result = null;
//
//        backtrack(new StringBuilder(), n, k);
//
//        return result;
//    }
//
//    private void backtrack(StringBuilder temp, int n, int k) {
//        if (temp.length() == n) {
//            if (count == k) {
//                result = temp.toString();
//            }
//
//            count++;
//        }
//
//        for (int i = 1; i <= n; i++) {
//            if (temp.indexOf(String.valueOf(i)) != -1) {
//                continue;
//            }
//
//            temp.append(i);
//
//            backtrack(temp, n, k);
//
//            temp.delete(temp.length() - 1, temp.length());
//        }
//    }
}
