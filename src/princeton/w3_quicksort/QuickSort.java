package princeton.w3_quicksort;

import edu.princeton.cs.algs4.StdRandom;
import princeton.w2_elementarysorts.InsertionSort;

public class QuickSort {
    private static final int CUTOFF = 10;

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int low, int hi) {
        if (low + CUTOFF - 1 >= hi) {
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.sort(a, low, hi);
            return;
        }

        int j = partition(a, low, hi);
        sort(a, low, j - 1);
        sort(a, j + 1, hi);
    }

    public static int partition(Comparable[] a, int low, int hi) {
        Comparable key = a[low];

        int i = low;
        int j = hi + 1;

        while (true) {
            // find first item from left that's greater than key to swap
            while (less(a[++i], key)) {
                if (i == hi) {
                    break;
                }
            }

            // find first item from right that's smaller than key to swap
            while (less(key, a[--j])) {
                if (j == low) {
                    break;
                }
            }

            // check if 2 pointers cross
            if (i >= j) {
                break;
            }

            // swap
            exchange(a, i, j);
        }

        // swap partition item
        exchange(a, low, j);

        return j;
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
