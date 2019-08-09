package leetcode.easy;

/**
 * 2018.4.26 Question 171. Excel Sheet Column Number
 * https://leetcode.com/problems/excel-sheet-column-number/description/
 * <p>
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * AA -> 27
 *
 * Solution
 * 1. revert to Q168, use formula
 */
public class Q171ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        int length = s.length();
        int current = 0;
        int result = 0;

        while (current < length) {
            char temp = s.charAt(current);

            result = result * 26 + (temp - 'A' + 1);

            current++;
        }

        return result;
    }
}
