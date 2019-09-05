package testutil;

public class ArrayUtil {
    public static boolean firstNElementsEquals(int[] array1, int[] array2, int n) {
        if (array1.length < n || array2.length < n) {
            throw new UnsupportedOperationException();
        }

        for (int i = 0; i < n; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
