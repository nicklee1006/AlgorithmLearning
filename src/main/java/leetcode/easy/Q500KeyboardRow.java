package leetcode.easy;

import java.util.*;

/**
 * 2018.6.5 Question 500. Keyboard Row
 * https://leetcode.com/problems/keyboard-row/description/
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of
 * American keyboard like the image below.
 *
 * Solution
 * 1. construct array contains char in one row
 * 2. use map to map each char with it's row index
 * 3. loop all words to see if all char in the word has the same row index
 */
public class Q500KeyboardRow {
    public static String[] findWords(String[] words) {
        String[] lines = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        Map<Character, Integer> index = new HashMap<>();

        for (int i = 0; i < lines.length; i++) {
            for (char c : lines[i].toCharArray()) {
                index.put(c, i);
            }
        }

        List<String> result = new ArrayList<>();
        for (String temp : words) {
            int tempIndex = index.get(temp.toLowerCase().charAt(0));
            for (char c : temp.toLowerCase().toCharArray()) {
                int index2 = index.get(c);

                if (index2 != tempIndex) {
                    tempIndex = -1;
                    break;
                }
            }

            if (tempIndex != -1) {
                result.add(temp);
            }
        }

        return result.toArray(new String[0]);
    }
}
