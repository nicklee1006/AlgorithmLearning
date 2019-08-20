package w2_elementarysorts;

import java.util.Arrays;

public class InsertionSort extends ElementarySort {
    @Override
    public void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exchange(a, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public void sort(Comparable[] a, int low, int high) {
        sort(Arrays.copyOfRange(a, low, high + 1));
    }
}
