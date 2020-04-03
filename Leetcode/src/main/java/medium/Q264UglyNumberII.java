package medium;

public class Q264UglyNumberII {
    public static int nthUglyNumber(int n) {
        // store the ugly number
        int[] ugly = new int[n];
        ugly[0] = 1;

        int index2 = 0;
        int index3 = 0;
        int index5 = 0;

        for (int i = 1; i < n; i++) {
            int factor2 = 2 * ugly[index2];
            int factor3 = 3 * ugly[index3];
            int factor5 = 5 * ugly[index5];

            int min = Math.min(factor2, Math.min(factor3, factor5));

            if (min == factor2) {
                index2++;
            }

            if (min == factor3) {
                index3++;
            }

            if (min == factor5) {
                index5++;
            }

            ugly[i] = min;
        }

        return ugly[n - 1];
    }
}
