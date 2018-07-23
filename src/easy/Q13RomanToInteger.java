package easy;

/**
 * 2018.3.18 Question 13: Roman to Integer
 * https://leetcode.com/problems/roman-to-integer
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 *
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as,
 * XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four
 * is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it
 * making four. The same principle applies to the number nine, which is written as IX. There are six instances
 * where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to
 * 3999.
 */
public class Q13RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;

        if (s.contains("IV")) {
            result -= 2;
        }
        if (s.contains("IX")) {
            result -= 2;
        }
        if (s.contains("XL")) {
            result -= 20;
        }
        if (s.contains("XC")) {
            result -= 20;
        }
        if (s.contains("CD")) {
            result -= 200;
        }
        if (s.contains("CM")) {
            result -= 200;
        }

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp == 'I') {
                result += 1;
            }
            if (temp == 'V') {
                result += 5;
            }
            if (temp == 'X') {
                result += 10;
            }
            if (temp == 'L') {
                result += 50;
            }
            if (temp == 'C') {
                result += 100;
            }
            if (temp == 'D') {
                result += 500;
            }
            if (temp == 'M') {
                result += 1000;
            }
        }

        return result;
    }
}
