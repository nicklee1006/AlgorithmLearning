package medium;

public class Q275HIndexII {
    public static int hIndex(int[] citations) {
        // find the first point over the line
        int n = citations.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // mid point above line
            if (citations[mid] >= n - mid) {
                if (mid == 0) {
                    return n;
                }

                // previous point below line
                int previous = mid - 1;
                if (citations[previous] < n - previous) {
                    return n - mid;
                }

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0;
    }
}
