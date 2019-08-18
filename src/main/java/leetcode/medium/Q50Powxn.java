package leetcode.medium;

public class Q50Powxn {
    public static double myPow(double x, int n) {
        double result = 1;

        if (x == 1) {
            return 1;
        }

        if (x == -1) {
            if (n % 2 == 0) {
                return 1;
            } else {
                return -1;
            }
        }

        if (n == Integer.MIN_VALUE) {
            return 0;
        }

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;

                if (result == 0) {
                    break;
                }
            }
        } else {
            n = -n;

            for (int i = 0; i < n; i++) {
                result *= x;
            }

            result = 1 / result;
        }

        return result;
    }
}
