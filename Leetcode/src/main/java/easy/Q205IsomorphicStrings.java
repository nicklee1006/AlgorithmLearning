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
 *
 * Solution
 * 1. Use Map to store each character and it's first index of appearance
 */
public class Q205IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        // map to store first occurrence of a char
        Map<Character, Integer> indexS = new HashMap<>();
        Map<Character, Integer> indexT = new HashMap<>();

        // assume same length
        for (int i = 0; i < s.length(); i++) {
            // get char
            char charInS = s.charAt(i);
            char charInT = t.charAt(i);

            int tempIndexS;
            int tempIndexT;

            // get first occurrence index of 'charInS'
            if (indexS.containsKey(charInS)) {
                tempIndexS = indexS.get(charInS);
            } else {
                tempIndexS = i;
                indexS.put(charInS, i);
            }

            // get first occurrence index of 'charInT'
            if (indexT.containsKey(charInT)) {
                tempIndexT = indexT.get(charInT);
            } else {
                tempIndexT = i;
                indexT.put(charInT, i);
            }

            // if they don't match, then false
            if (tempIndexS != tempIndexT) {
                return false;
            }
        }

        return true;
    }
}
