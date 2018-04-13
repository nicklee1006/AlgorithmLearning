package easy;

/**
 * 2018.3.18
 * Question 13: Roman to Integer
 * https://leetcode.com/problems/roman-to-integer
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
