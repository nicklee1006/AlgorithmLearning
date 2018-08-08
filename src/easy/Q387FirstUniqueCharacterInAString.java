package easy;

/**
 * 2018.5.20 Question 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 *
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 *
 * Solution
 * 1. 2 loops, log(n)
 * 2. Construct a array, index represent the char, value for occurrence
 * 3. Find the first char with occurrence 1
 */
public class Q387FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        int[] letters = new int[256];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (letters[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
