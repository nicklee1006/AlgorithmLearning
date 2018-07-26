package easy;

/**
 * 2018.3.31: Add Binary
 * https://leetcode.com/problems/add-binary/description/
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 *
 * Solution
 * 1. Calculate carry for each digit: (n1+n2+carry)/2;
 * 2. Calculate each digit: (x+y+carry)%2
 */
public class Q67AddBinary {
    public static String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();

        int pos = 0;
        int carry = 0;

        String result = "";

        while (pos < lengthA || pos < lengthB || carry == 1) {
            int x = (pos < lengthA) ? Character.getNumericValue(a.charAt(lengthA - pos - 1)) : 0;
            int y = (pos < lengthB) ? Character.getNumericValue(b.charAt(lengthB - pos - 1)) : 0;

            result = (x + y + carry) % 2 + result;
            carry = (x + y + carry) / 2;

            pos++;
        }

        return result;
    }
}
