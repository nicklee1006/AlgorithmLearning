package util;

import java.util.List;

public class ListOfListTestUtil {
    public static boolean isTwoListOfListEqual(List<List<Integer>> actual, List<List<Integer>> expected) {
        for (List<Integer> actualList : actual) {
            if (!hasList(actualList, expected)) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasList(List<Integer> list, List<List<Integer>> expected) {
        for (List<Integer> tempList : expected) {
            if (list.size() == tempList.size() && tempList.containsAll(list)) {
                return true;
            }
        }

        return false;
    }
}
