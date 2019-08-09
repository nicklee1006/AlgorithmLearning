package leetcode.easy;

/**
 * 2018.7.1 Question 693. Binary Number with Alternating Bits
 * https://leetcode.com/problems/binary-number-with-alternating-bits/description/
 *
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will
 * always have different values.
 *
 * Solution
 * 1. Integer.toBinaryString(n)
 */
public class Q693BinaryNumberWithAlternatingBits {
    public static boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);

        for (int i = 1; i < binary.length(); i++) {
            if (binary.charAt(i - 1) == binary.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
