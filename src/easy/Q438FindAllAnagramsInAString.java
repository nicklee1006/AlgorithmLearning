package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 2018.5.26 Question 438. Find All Anagrams in a String
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 *
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 * Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
 * The order of output does not matter.
 */
public class Q438FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            String temp = s.substring(i, i + p.length());

            if (isAnagrams(temp, p)) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isAnagrams(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            count[sChar-'a']++;
            count[tChar-'a']--;
        }

        for (int temp : count) {
            if (temp != 0) {
                return false;
            }
        }

        return true;
    }
}
