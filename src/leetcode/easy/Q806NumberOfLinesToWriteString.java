package leetcode.easy;

/**
 * 2018.7.12 Question 806. Number of Lines To Write String
 * https://leetcode.com/problems/number-of-lines-to-write-string/description/
 *
 * We are to write the letters of a given string S, from left to right into lines. Each line has
 * maximum width 100 units, and if writing a letter would cause the width of the line to exceed
 * 100 units, it is written on the next line. We are given an array widths, an array where
 * widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the
 * width of 'z'.
 *
 * Now answer two questions: how many lines have at least one character from S, and what is the
 * width used by the last such line? Return your answer as an integer list of length 2.
 *
 * Solution
 * 1. if lineCount + width > 100, start new line
 */
public class Q806NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int[] result = new int[2];

        result[0] = 1;

        int lineCount = 0;
        for (int i = 0; i < S.length(); i++) {
            char tempChar = S.charAt(i);
            int index = tempChar - 'a';

            if (lineCount + widths[index] > 100) {
                result[0]++;
                lineCount = widths[index];
            } else {
                lineCount += widths[index];
            }
        }

        result[1] = lineCount;

        return result;
    }
}
