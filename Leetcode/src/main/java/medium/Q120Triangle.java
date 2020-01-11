package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q120Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> previousRow = triangle.get(0);

        // loop every row
        for (int row = 1; row < triangle.size(); row++) {
            List<Integer> temp = new ArrayList<>();

            // loop elements in the row
            for (int i = 0; i < triangle.get(row).size(); i++) {
                // current element
                int elementCurrent = triangle.get(row).get(i);

                // first or last element, add current one with previous row adjacent elements
                if (i == 0) {
                    temp.add(elementCurrent + previousRow.get(i));
                } else if (i == triangle.get(row).size() - 1) {
                    temp.add(elementCurrent + previousRow.get(previousRow.size() - 1));
                } else {
                    temp.add(Math.min(elementCurrent + previousRow.get(i - 1), elementCurrent + previousRow.get(i)));
                }
            }

            previousRow.clear();
            previousRow.addAll(temp);
        }

        // now previous row is the last row
        // sort and find the minimum one
        Collections.sort(previousRow);
        return previousRow.get(0);
    }
}
