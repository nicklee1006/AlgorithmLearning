package princeton.w3_quicksort;

import edu.princeton.cs.algs4.StdRandom;

public class QuickSelect {
    public static Comparable select(Comparable[] a, int k) {
        StdRandom.shuffle(a);

        int low = 0;
        int hi = a.length - 1;

        while (hi > low) {
            int j = QuickSort.partition(a, low, hi);

            if (j > k) {
                hi = j - 1;
            } else if (j < k) {
                low = j + 1;
            } else {
                return a[k];
            }
        }

        return a[k];
    }


}
