package leetcode.easy;

/**
 * Given an integer, write an algorithm to convert it to hexadecimal. For negative integer,
 * two’s complement method is used.
 *
 * Note:
 *
 * All letters in hexadecimal (a-f) must be in lowercase.
 * The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented
 * by a single zero character '0'; otherwise, the first character in the hexadecimal string will not
 * be the zero character.
 * The given number is guaranteed to fit within the range of a 32-bit signed integer.
 * You must not use any method provided by the library which converts/formats the number to hex
 * directly.
 *
 * hint:
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/discuss/89253/Simple-Java-solution-with-comment
 *
 * Solution
 * 1. Each time take a look at the last digits of the number, and convert it to a hex char
 * 2. Shift the number to right for 4 bits
 * 3. Do again until no bits left
 */
public class Q405ConvertANumberToHexadecimal {
    public static String toHex(int num) {
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        if (num == 0) {
            return "0";
        }

        String result = "";
        while (num != 0) {
            result = hex[num & 15] + result;

            num = (num >>> 4);
        }

        return result;
    }
}
