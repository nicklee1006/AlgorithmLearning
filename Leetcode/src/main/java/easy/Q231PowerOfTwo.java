package easy;

/**
 * 2018.5.8 Question 231. Power of Two
 * https://leetcode.com/problems/power-of-two/discuss/63966/4-different-ways-to-solve-Iterative-Recursive-Bit-operation-Math
 * <p>
 * Given an integer, write a function to determine if it is a power of two.
 *
 * hint: there are only one '1' in the bit
 * https://leetcode.com/problems/power-of-two/discuss/63974/Using-nand(n-1)-trick
 *
 * Solution
 * 1. Constantly divide by two
 * 2. Or: count the '1' in the bit: Integer.bitCount(num)==1;
 */
public class Q231PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }
}
