package testutil;

import java.util.List;

public class ListOfListTestUtil<T> {
    public boolean isTwoListOfListEqual(List<List<T>> actual, List<List<T>> expected) {
        for (List<T> actualList : actual) {
            if (!hasList(actualList, expected)) {
                return false;
            }
        }

        return true;
    }

    private boolean hasList(List<T> list, List<List<T>> expected) {
        for (List<T> tempList : expected) {
            if (list.size() == tempList.size() && tempList.containsAll(list)) {
                return true;
            }
        }

        return false;
    }
}
