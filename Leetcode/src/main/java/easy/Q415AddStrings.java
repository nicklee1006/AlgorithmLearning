package easy;

/**
 * 2018.5.24 Question 415. Add Strings
 * https://leetcode.com/problems/add-strings/description/
 *
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 *
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 * Solution
 * 1. sum = n1 + n2 + carry
 * 2. carry = sum > 9? 1 : 0
 * 3. If carry = 1 at last, insert 1 at front
 */
public class Q415AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();

        int lengthNum1 = num1.length() - 1;
        int lengthNum2 = num2.length() - 1;
        int carry = 0;

        while (lengthNum1 >= 0 || lengthNum2 >= 0) {
            int n1 = lengthNum1 >= 0 ? num1.charAt(lengthNum1) - '0' : 0;
            int n2 = lengthNum2 >= 0 ? num2.charAt(lengthNum2) - '0' : 0;

            int sum = n1 + n2 + carry;
            carry = sum > 9 ? 1 : 0;

            stringBuilder.insert(0, sum % 10);

            lengthNum1--;
            lengthNum2--;
        }

        if (carry == 1) {
            stringBuilder.insert(0, 1);
        }

        return stringBuilder.toString();
    }
}
