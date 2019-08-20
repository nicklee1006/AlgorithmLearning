package easy;

/**
 * 2018.7.22 Question 868. Binary Gap
 * https://leetcode.com/problems/binary-gap/description/
 *
 * Given a positive integer N, find and return the longest distance between two consecutive 1's in the binary
 * representation of N.
 *
 * If there aren't two consecutive 1's, return 0.
 *
 * Solution
 * 1. Don't understand!!!!
 */
public class Q868BinaryGap {
    public static int binaryGap(int N) {
        int result = 0;
        int lastPos = -1;
        int currentPos = 0;

        while (N != 0) {
            currentPos++;

            if ((N & 1) == 1) {
                if (lastPos != -1) {
                    result = Math.max(result, currentPos - lastPos);
                }

                lastPos = currentPos;
            }

            N >>= 1;
        }

        return result;
    }
}
