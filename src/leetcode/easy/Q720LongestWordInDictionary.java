package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 2018.7.3 Question 720. Longest Word in Dictionary
 * https://leetcode.com/problems/longest-word-in-dictionary/description/
 *
 * Given a list of strings words representing an English Dictionary, find the longest word in words
 * that can be built one character at a time by other words in words. If there is more than one
 * possible answer, return the longest word with the smallest lexicographical order.
 *
 * Solution
 * 1. sort the array from short to long
 * 2. add shorter words in a set
 * 3. find the longest one
 */
public class Q720LongestWordInDictionary {
    public static String longestWord(String[] words) {
        Arrays.sort(words);

        String result = "";

        Set<String> set = new HashSet<>();

        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                result = word.length() > result.length() ? word : result;

                set.add(word);
            }
        }

        return result;
    }
}
