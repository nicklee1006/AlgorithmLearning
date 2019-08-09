package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.5.23 Question 409. Longest Palindrome
 * https://leetcode.com/problems/longest-palindrome/description/
 *
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest
 * palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * Note:
 * Assume the length of given string will not exceed 1,010.
 *
 * Solution
 * 1. Count the occurence of each char
 * 2. If the count is even, add to result
 * 3. Add the largest odd count
 * 4. Add other odd count - 1
 */
@SuppressWarnings("ALL")
public class Q409LongestPalindrome {
    public static int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char tempChar = s.charAt(i);
            if (count.containsKey(tempChar)) {
                count.put(tempChar, count.get(tempChar) + 1);
            } else {
                count.put(tempChar, 1);
            }
        }

        int result = 0;
        int biggestOdd = -1;

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            int temp = entry.getValue();
            if (temp % 2 == 0) {
                result += temp;
            } else {
                if (temp > biggestOdd && biggestOdd != -1) {
                    result--;
                    biggestOdd = temp;
                    result += temp;
                } else if (biggestOdd == -1) {
                    biggestOdd = temp;
                    result += temp;
                } else {
                    result += temp - 1;
                }
            }
        }

        return result;
    }
}
