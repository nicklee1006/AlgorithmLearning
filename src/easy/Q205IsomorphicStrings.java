package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.5.4 Question 205. Isomorphic Strings
 * https://leetcode.com/problems/isomorphic-strings/description/
 *
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order
 * of characters. No two characters may map to the same character but a character may map to itself.
 * Note:
 * You may assume both s and t have the same length.
 */
public class Q205IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> indexS = new HashMap<>();
        Map<Character, Integer> indexT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            int tempIndexS;
            int tempIndexT;

            if (indexS.containsKey(sChar)) {
                tempIndexS = indexS.get(sChar);
            } else {
                tempIndexS = i;
                indexS.put(sChar, i);
            }

            if (indexT.containsKey(tChar)) {
                tempIndexT = indexT.get(tChar);
            } else {
                tempIndexT = i;
                indexT.put(tChar, i);
            }

            if (tempIndexS != tempIndexT) {
                return false;
            }
        }

        return true;
    }
}
