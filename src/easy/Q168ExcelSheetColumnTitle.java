package easy;

/**
 * 2018.4.24 Question 168. Excel Sheet Column Title
 * https://leetcode.com/problems/excel-sheet-column-title/description/
 *
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * hint:
 * base 26 representation, similar when converting a number from base 10 to base 2
 */
public class Q168ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while (n != 0) {
            char temp = (char) ((n - 1) % 26 + 'A');
            n = (n - 1) / 26;
            result.append(temp);
        }

        return result.reverse().toString();
    }
}
