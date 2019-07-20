package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q3LongestSubstringWithoutRepeatingCharacters {
    /**
     * slide window
     * keep index of char, so that can know which char is repeated
     * find the repeated char
     * get the index of repeated char j', then skip the check for i - j' as it can't be longer than start from i
     *
     */
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;

        Map<Character, Integer> tempMap = new HashMap<>();

        for (int i = 0, j = 0; j < s.length(); j++) {
            // find repeat, skip i - j'
            if (tempMap.containsKey(s.charAt(j))) {
                i = Math.max(tempMap.get(s.charAt(j)) + 1, i);
            }

            result = Math.max(result, j - i + 1);
            tempMap.put(s.charAt(j), j);
        }

        return result;
    }

    /**
     * Sliding window
     */
//    public static int lengthOfLongestSubstring(String s) {
//        int result = 0;
//        int i = 0;
//        int j = 0;
//
//        Set<Character> tempSet = new HashSet<>();
//
//        while (i < s.length() && j < s.length()) {
//            // not find repeat
//            if (!tempSet.contains(s.charAt(j))) {
//                tempSet.add(s.charAt(j++));
//
//                result = Math.max(result, j - i);
//            } else {
//                tempSet.remove(s.charAt(i));
//                i++;
//            }
//        }
//
//        return result;
//    }

    /**
     * Naive method, brute force, 2 loops O(n2)
     */
//    public static int lengthOfLongestSubstring(String s) {
//        if (s.length() == 0) {
//            return 0;
//        }
//
//        if (s.length() == 1) {
//            return 1;
//        }
//
//        int result = Integer.MIN_VALUE;
//
//        Set<Character> tempSet = new HashSet<>();
//
//        // check the longest length start from the first, use set to record having chars
//        // then check the longest start from second, so on and so forth
//        // clear the set
//        for (int i = 0; i < s.length(); i++) {
//            // add the current char
//            tempSet.add(s.charAt(i));
//
//            for (int j = i + 1; j < s.length(); j++) {
//                // find repeat
//                if (!tempSet.add(s.charAt(j))) {
//                    break;
//                }
//            }
//
//            if (tempSet.size() > result) {
//                result = tempSet.size();
//            }
//
//            tempSet.clear();
//        }
//
//        return result;
//    }
}
