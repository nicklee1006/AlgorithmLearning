package easy;

/**
 * 2018.4.28 Question 190. Reverse Bits
 * https://leetcode.com/problems/reverse-bits/description/
 *
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Follow up:
 * If this function is called many times, how would you optimize it?
 *
 * hint: Java bit manipulation: https://www.tutorialspoint.com/java/java_basic_operators.htm
 *
 * Solution
 * 1. The last bit of n need to shift left for 31 times
 * 2. Get last bit of n
 * 3. Right shift n for 1-bit
 * 4. shift result to ledt
 *
 */
public class Q190ReverseBits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // get last bit of n
            result += n&1;

            // shift n to left for 1 bit
            n = n>>>1;

            // shift result to right
            if (i < 31) {
                result = result << 1;
            }
        }

        return result;
    }
}
