package easy;

/**
 * 2018.5.20 Question 383: Ransom Note
 * https://leetcode.com/problems/ransom-note/description/
 *
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines;
 * otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 */
public class Q383RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            letters[magazine.charAt(i)-'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (letters[ransomNote.charAt(i) - 'a'] > 0) {
                letters[ransomNote.charAt(i) - 'a']--;
            } else {
                return false;
            }
        }

        return true;
    }
}
