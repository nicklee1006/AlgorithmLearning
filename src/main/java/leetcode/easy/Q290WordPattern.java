package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.5.14 Question 290. Word Pattern
 * https://leetcode.com/problems/word-pattern/description/
 *
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern
 * and a non-empty word in str.
 *
 * Solution
 * 1. not equal length, return false
 * 2. Use 2 map to store char and it's first occurance index
 * 3. Compare index
 */
public class Q290WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        Map<Character, Integer> mapPattern = new HashMap<>();
        Map<String, Integer> mapStr = new HashMap<>();

        String[] strSplit = str.split("\\s+");

        if (pattern.length() != strSplit.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            int indexPattern;
            int indexStr;

            if (mapPattern.containsKey(c)) {
                indexPattern = mapPattern.get(c);
            } else {
                indexPattern = i;
                mapPattern.put(c, i);
            }

            if (mapStr.containsKey(strSplit[i])) {
                indexStr = mapStr.get(strSplit[i]);
            } else {
                indexStr = i;
                mapStr.put(strSplit[i], i);
            }

            if (indexPattern != indexStr) {
                return false;
            }
        }

        return true;
    }
}
