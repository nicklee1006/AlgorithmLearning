package easy;

/**
 * 2018.3.28: Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/description/
 */
public class Q58LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] splits = s.split("\\s+");

        return splits.length == 0 ? 0 : splits[splits.length - 1].length();
    }
}
