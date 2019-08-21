package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q56MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }

        List<List<Integer>> listResults = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        listResults.add(Arrays.stream(intervals[0]).boxed().collect(Collectors.toList()));
        for (int i = 1; i < intervals.length; i++) {
            Integer[] previous = listResults.get(listResults.size() - 1).toArray(new Integer[0]);

            if (isOverlap(previous, intervals[i])) {
                listResults.get(listResults.size() - 1).set(0, Math.min(previous[0], intervals[i][0]));
                listResults.get(listResults.size() - 1).set(1, Math.max(previous[1], intervals[i][1]));
            } else {
                listResults.add(Arrays.stream(intervals[i]).boxed().collect(Collectors.toList()));
            }
        }

        int[][] results = new int[listResults.size()][2];
        for (int i = 0; i < listResults.size(); i++) {
            results[i][0] = listResults.get(i).get(0);
            results[i][1] = listResults.get(i).get(1);
        }

        return results;
    }

    private static boolean isOverlap(Integer[] a, int[] b) {
        return !(a[1] < b[0]);
    }
}
