package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2018.6.17 Question 599. Minimum Index Sum of Two Lists
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
 *
 * Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite
 * restaurants represented by strings.
 *
 * You need to help them find out their common interest with the least list index sum. If there is a choice
 * tie between answers, output all of them with no order requirement. You could assume there always exists
 * an answer.
 */
public class Q599MinimumIndexSumOfTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> list1Index = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            list1Index.put(list1[i], i);
        }

        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length; i++) {
            int index1 = list1Index.getOrDefault(list2[i], -1);

            if (index1 != -1 && (index1 + i) <= minSum) {
                if ((index1 + i) < minSum) {
                    minSum = index1 + i;
                    result.clear();
                }

                result.add(list2[i]);
            }
        }

        return result.toArray(new String[0]);
    }
}
