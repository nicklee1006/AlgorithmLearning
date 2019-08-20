package w3_mergesort;

import w2_elementarysorts.InsertionSort;

public class Mergesort {
    private static final int CUTOFF = 7;

    public static void sort(Comparable[] a) {

        Comparable[] aux = new Comparable[a.length];

        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int low, int hi) {
        // improve efficiency for small array
        if (hi <= low + CUTOFF - 1) {
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sort(a, low, hi);
            return;
        }

        int mid = (low + hi) / 2;

        sort(a, aux, low, mid);
        sort(a, aux, mid + 1, hi);

        // stop if left and right is already sorted
        if (!less(a[mid + 1], a[mid])) {
            return;
        }

        merge(a, aux, low, mid, hi);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int hi) {
        System.arraycopy(a, 0, aux, 0, a.length);

        int i = low;
        int j = mid + 1;
        for (int k = 0; k < hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                a[k] = aux[i++];
            } else {
                a[k] = aux[j++];
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}
