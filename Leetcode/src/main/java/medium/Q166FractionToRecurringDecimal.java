package medium;

import java.util.HashMap;
import java.util.Map;

public class Q166FractionToRecurringDecimal {
    public static String fractionToDecimal(int numerator, int denominator) {
        long num = numerator;
        long den = denominator;

        String sign = "";

        // first determine the sign
        if ((num > 0 && den < 0) || (num < 0 && den > 0)) {
            sign = "-";
        }

        // make num and den positive
        num = Math.abs(num);
        den = Math.abs(den);

        // determine the digit before decimal point
        long integer = num / den;

        // use a map to record encountered num and it's location
        Map<Long, Integer> map = new HashMap<>();

        // location of index after decimal point
        int index = 0;

        // use a string to record all digits after decimal point
        StringBuilder decimal = new StringBuilder();

        // mark the location of starting point of repeating
        int repeatingIndex = -1;

        // get the remaining
        num = num - integer * den;

        // enter while loop
        // condition to exit: remaining is 0 or find repeating
        while (num != 0) {
            // remaining * 10
            num = num * 10;

            // find if we have already encountered this 'num' before
            if (map.containsKey(num)) {
                repeatingIndex = map.get(num);
                break;
            }

            // put num to map
            map.put(num, index);

            // calculate new digit
            long temp = num / den;

            decimal.append(temp);

            // update num
            num = num - temp * den;

            // increase index
            index++;
        }

        // see if there is repeating
        if (repeatingIndex != -1) {
            return sign + integer + "." + decimal.substring(0, repeatingIndex) + "(" + decimal.substring(repeatingIndex) + ")";
        } else {
            if (decimal.length() == 0) {
                return sign + integer;
            } else {
                return sign + integer + "." + decimal;
            }
        }
    }
}
