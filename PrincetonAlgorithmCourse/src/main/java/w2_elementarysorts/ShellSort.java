package w2_elementarysorts;

public class ShellSort extends ElementarySort {
    @Override
    public void sort(Comparable[] a) {
        int h = 1;

        // get largest h
        while (h < a.length / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h; j = j - h) {
                    if (less(a[j], a[j - h])) {
                        exchange(a, j, j - h);
                    } else {
                        break;
                    }
                }

                h = h / 3;
            }
        }
    }
}
