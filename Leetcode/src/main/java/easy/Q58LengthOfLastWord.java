package easy;

/**
 * 2018.3.28: Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the
 * length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 */
public class Q58LengthOfLastWord {
    /**
     * Just use String.split
     * O(n)
     */
    public static int lengthOfLastWord(String s) {
        String[] splits = s.split("\\s+");

        return splits.length == 0 ? 0 : splits[splits.length - 1].length();
    }
}
