package medium;

public class Q50Powxn {
    public static double myPow(double x, int n) {
        double result = 1;

        // special case when x = 1
        if (x == 1) {
            return 1;
        }

        // special case when x = -1
        if (x == -1) {
            if (n % 2 == 0) {
                return 1;
            } else {
                return -1;
            }
        }

        // special case when n = Int.MIN_VALUE
        if (n == Integer.MIN_VALUE) {
            return 0;
        }

        // n > 0
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;

                // if any point result == 0, no need to continue
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
