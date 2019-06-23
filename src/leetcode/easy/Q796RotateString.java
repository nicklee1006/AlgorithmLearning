package leetcode.easy;

/**
 * 2018.7.10 Question 796. Rotate String
 * https://leetcode.com/problems/rotate-string/description/
 *
 * We are given two strings, A and B.
 *
 * A shift on A consists of taking string A and moving the leftmost character to the rightmost
 * position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return
 * True if and only if A can become B after some number of shifts on A.
 *
 * Solution
 * 1. 2 conditions
 *  1.1 same length
 *  1.2 (A + A) contains B
 */
public class Q796RotateString {
    public static boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }
}
