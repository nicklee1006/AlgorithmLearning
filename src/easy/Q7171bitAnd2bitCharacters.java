package easy;

/**
 * 2018.7.3 Question 717. 1-bit and 2-bit Characters
 * https://leetcode.com/problems/1-bit-and-2-bit-characters/description/
 *
 * We have two special characters. The first character can be represented by one bit 0. The second
 * character can be represented by two bits (10 or 11).
 *
 * Now given a string represented by several bits. Return whether the last character must be a one-bit
 * character or not. The given string will always end with a zero.
 */
public class Q7171bitAnd2bitCharacters {
    public static boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) {
            return true;
        }

        int numOfOne = 0;

        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == 0) {
                break;
            }

            numOfOne++;
        }

        return numOfOne % 2 == 0;
    }
}
