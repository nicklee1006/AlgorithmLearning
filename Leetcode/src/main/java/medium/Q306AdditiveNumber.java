package medium;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class Q306AdditiveNumber {
    public static boolean isAdditiveNumber(String num) {
        AtomicBoolean result = new AtomicBoolean(false);

        backtracking(result, new BigInteger("0"), new BigInteger("0"), 0, 0, num);

        return result.get();
    }

    private static void backtracking(AtomicBoolean result, BigInteger a, BigInteger b, int numberCount, int start, String num) {
        // meet condition
        // numberCount >= 3 && start = num.length
        if (numberCount >= 3 && num.length() == start) {
            result.set(true);

            return;
        }

        int index = start;

        while (index < num.length()) {
            // next number candidate, start with next 1 digit
            String nextNumStr = num.substring(start, index + 1);

            // if start with 0, not possible, back to previous
            if (nextNumStr.startsWith("0") && !nextNumStr.equals("0")) {
                return;
            }

            BigInteger nextNum = new BigInteger(nextNumStr);

            // if have less than 2 number or a + b == nextNum, enter next loop
            int compare = a.add(b).compareTo(nextNum);

            if (numberCount < 2 || compare == 0) {
                backtracking(result, b, nextNum, numberCount + 1, index + 1, num);
            }

            // already have result or a + b < nextNum, not possible
            if (result.get() || (a.compareTo(BigInteger.ZERO) != 0 && compare < 0)) {
                return;
            }

            index++;
        }
    }
}
