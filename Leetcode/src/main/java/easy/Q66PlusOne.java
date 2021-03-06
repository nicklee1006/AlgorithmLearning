package easy;

/**
 * 2018.3.30: Plus One
 * https://leetcode.com/problems/plus-one/description/
 *
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 *

 */
public class Q66PlusOne {
    /**
     *  Solution
     *      1. If any digit is not zero, add 1 to it and then return
     *      2. If 9, make it zero, and proceed next digit.
     *      3. Handle 999999, special case
     */
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            // if any digit is not 0, then increase it and return
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }

            // this digit is 9, so set to 0 and increase the digit left to it.
            digits[i] = 0;
        }

        // if 999999
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
