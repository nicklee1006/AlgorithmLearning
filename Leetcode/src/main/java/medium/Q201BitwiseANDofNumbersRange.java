package medium;

public class Q201BitwiseANDofNumbersRange {
    public static int rangeBitwiseAnd(int m, int n) {
        // special case when m = 2147483647 Integer.max
        if (m == Integer.MAX_VALUE) {
            return m;
        }

        // initialize result as m
        int result = m;

        // loop from m + 1 to n
        for (int i = m + 1; i <= n; i++) {
            result = result & i;

            if (result == 0 || i == Integer.MAX_VALUE) {
                break;
            }
        }

        return result;
    }
}
