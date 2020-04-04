package medium;

import java.util.Arrays;

public class Q274HIndex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);

        int index = 1;

        for (int i = citations.length - 1; i >= 0; i--) {
            if (index > citations[i]) {
                break;
            }

            index++;
        }

        return index - 1;
    }
}
