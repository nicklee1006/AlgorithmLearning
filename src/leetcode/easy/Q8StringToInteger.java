package leetcode.easy;

public class Q8StringToInteger {
    public static int myAtoi(String str) {
        // remove space in the head
        str = str.trim();

        // empty string
        if (str.length() == 0) {
            return 0;
        }

        int result = 0;
        int sign = 1;
        int index = 0;

        // check to first char is either '+', '-' or digit, or invalid
        if (str.charAt(index) == '+') {
            index++;
        } else if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (!Character.isDigit(str.charAt(0))) {
            return 0;
        }

        for (; index < str.length(); index++) {
            char tempChar = str.charAt(index);
            if (Character.isDigit(tempChar)) {
                int tempInt = Character.getNumericValue(tempChar);

                // handle overflow
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10) && (tempInt > Integer.MAX_VALUE % 10)) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + tempInt;
            } else {
                return result * sign;
            }
        }

        return result * sign;
    }
}
