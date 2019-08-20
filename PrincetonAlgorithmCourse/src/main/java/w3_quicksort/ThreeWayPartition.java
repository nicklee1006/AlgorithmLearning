package w3_quicksort;

public class ThreeWayPartition {
    public static void sort(Comparable[] a, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int i = low;
        int lt = low;
        int gt = hi;

        Comparable key = a[low];

        while (i <= gt) {
            if (less(a[i], key)) {
                exchange(a, lt++, i++);
            } else if (less(key, a[i])) {
                exchange(a, gt--, i);
            } else {
                i++;
            }
        }

        sort(a, low, lt - 1);
        sort(a, gt + 1, hi);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exchange(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
