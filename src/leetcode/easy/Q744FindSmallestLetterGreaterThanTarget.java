package leetcode.easy;

/**
 * 2018.7.5 Question 744. Find Smallest Letter Greater Than Target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 *
 * Given a list of sorted characters letters containing only lowercase letters, and given a target
 * letter target, find the smallest element in the list that is larger than the given target.
 *
 * Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the
 * answer is 'a'.
 *
 * Solution
 * 1. loop, find first greater than target
 */
public class Q744FindSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char temp : letters) {
            if (temp > target) {
                return temp;
            }
        }

        return letters[0];
    }
}
