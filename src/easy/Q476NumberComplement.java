package easy;

/**
 * 2018.6.1 Question 476. Number Complement
 * https://leetcode.com/problems/number-complement/description/
 *
 * Given a positive integer, output its complement number. The complement strategy is to
 * flip the bits of its binary representation.
 *
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 *
 * hint:
 * https://leetcode.com/problems/number-complement/discuss/95992/Java-1-line-bit-manipulation-solution
 *
 * Solution
 * 1. Not understand!!!
 */
public class Q476NumberComplement {
    public static int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;

        return ~num & mask;
    }
}
