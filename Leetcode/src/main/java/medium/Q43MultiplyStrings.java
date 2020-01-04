package medium;

public class Q43MultiplyStrings {
    public static String multiply(String num1, String num2) {
        // one of the number is zero
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        String result = "0";
        int index = 0;

        // from right to left, traverse number2
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuilder tempResult = new StringBuilder();
            int carry = 0;

            int tempNum2 = num2.charAt(i) - '0';

            // from right to left, traverse number1, multiple tempNum1 and tempNum2
            for (int j = num1.length() - 1; j >= 0; j--) {
                int tempNum1 = num1.charAt(j) - '0';

                int multiple = tempNum1 * tempNum2 + carry;

                tempResult.insert(0, multiple % 10 + "");
                carry = multiple / 10;
            }

            if (carry > 0) {
                tempResult.insert(0, carry);
            }

            // add 0 to the end
            for (int j = 0; j < index; j++) {
                tempResult.append("0");
            }

            index++;

            // add with previous number
            result = add(result, tempResult.toString());
        }

        return result;
    }

    private static String add(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int indexNum1 = num1.length() - 1;
        int indexNum2 = num2.length() - 1;

        while (indexNum1 >= 0 || indexNum2 >= 0) {
            int tempNum1 = indexNum1 >= 0 ? num1.charAt(indexNum1) - '0' : 0;
            int tempNum2 = indexNum2 >= 0 ? num2.charAt(indexNum2) - '0' : 0;

            int tempSum = tempNum1 + tempNum2 + carry;

            result.insert(0, tempSum % 10);
            carry = tempSum / 10;

            indexNum1--;
            indexNum2--;
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}
