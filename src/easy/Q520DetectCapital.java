package easy;

/**
 * 2018.6.8 Question 520. Detect Capital
 * https://leetcode.com/problems/detect-capital/description/
 *
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 *
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class Q520DetectCapital {
    public static boolean detectCapitalUse(String word) {
        char firstChar = word.charAt(0);
        boolean firstUpper = Character.isUpperCase(firstChar);

        boolean caseUpper = false;

        for (int i = 1; i < word.length(); i++) {
            char temp = word.charAt(i);

            if (firstUpper) {
                if (i == 1) {
                    caseUpper = Character.isUpperCase(word.charAt(i));
                } else {
                    if (Character.isUpperCase(temp) != caseUpper) {
                        return false;
                    }
                }
            } else {
                if (Character.isUpperCase(temp)) {
                    return false;
                }
            }

        }

        return true;
    }
}
