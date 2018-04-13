package easy;

/**
 * 2018.3.16
 * Question 7: Reverse Integer
 * https://leetcode.com/problems/reverse-integer/description/
 */
public class Q7ReverseInteger {
    public static int reverse(int x) {
        String numberString = String.valueOf(x);

        // process negative
        if (numberString.startsWith("-")) {
            numberString = numberString.substring(1, numberString.length());

            StringBuilder builder = new StringBuilder();
            builder.append(numberString);
            builder.reverse();

            numberString = builder.toString();

            while (numberString.startsWith("0")) {
                numberString = numberString.substring(1, numberString.length());
            }

            numberString = "-" + numberString;

            long result = Long.parseLong(numberString);

            if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) result;
            }
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append(numberString);
            builder.reverse();

            numberString = builder.toString();

            while (numberString.startsWith("0")) {
                numberString = numberString.substring(1, numberString.length());
            }

            if (numberString.equals("")) {
                numberString = "0";
            }

            long result = Long.parseLong(numberString);

            if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int) result;
            }
        }
    }
}
