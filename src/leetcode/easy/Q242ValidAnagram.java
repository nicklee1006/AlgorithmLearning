package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.5.10 Question 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/description/
 *
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * Anagram, string consist of same characters
 * e.g: s = "anagram", t = "nagaram"
 *
 * hint:
 * The idea is simple. It creates a size 26 int arrays as buckets for each letter in alphabet.
 * It increments the bucket value with String s and decrement with string t. So if they are
 * anagrams, all buckets should remain with initial value which is zero.
 *
 * Solution
 * 1. Create 26 char array
 * 2. Increase when meet corresponding char in s, and decrease in t
 * 3. Check if at end all array element is zero
 */
@SuppressWarnings("Duplicates")
public class Q242ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mapS.containsKey(c)) {
                mapS.put(c, mapS.get(c) + 1);
            } else {
                mapS.put(c, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (mapT.containsKey(c)) {
                mapT.put(c, mapT.get(c) + 1);
            } else {
                mapT.put(c, 1);
            }
        }

        return mapS.equals(mapT);
    }
}
