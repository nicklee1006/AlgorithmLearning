package leetcode.medium;

public class Q29DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        int result = -1;
        boolean isPositive = true;

        if (dividend > 0) {
            isPositive = false;

            dividend = negation(dividend);
        }

        if (divisor > 0) {
            isPositive = !isPositive;

            divisor = negation(divisor);
        }

        final int oriDividend = dividend;
        final int oriDivisor = divisor;

        if (dividend > divisor) {
            return 0;
        }

        dividend -= divisor;
        while (divisor >= dividend) {
            result = result * 2;
            divisor = divisor * 2;

            dividend -= divisor;
        }

        int tempResult = result + negation(divide(oriDividend - divisor, oriDivisor));

        if (tempResult == Integer.MIN_VALUE) {
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            return isPositive ? negation(tempResult) : tempResult;
        }
    }

//    public static int divide(int dividend, int divisor) {
//        int result = 0;
//        boolean isPositive = true;
//
//        if (dividend < 0) {
//            isPositive = false;
//
//            dividend = negation(dividend);
//        }
//
//        if (divisor < 0) {
//            isPositive = !isPositive;
//
//            divisor = negation(divisor);
//        }
//
//        if (dividend == Integer.MIN_VALUE && divisor == 1) {
//            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//        }
//
//        while (divisor <= dividend) {
//            result++;
//
//            dividend -= divisor;
//        }
//
//        return isPositive ? result : negation(result);
//    }

    private static int negation(int n) {
        return ~n + 1;
    }
}
