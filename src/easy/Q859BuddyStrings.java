package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2018.7.20 Question 859. Buddy Strings
 * https://leetcode.com/problems/buddy-strings/description/
 *
 * Given two strings A and B of lowercase letters, return true if and only if we can swap two letters in A
 * so that the result equals B.
 */
public class Q859BuddyStrings {
    public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        // A = B, swap two same char
        if (A.equals(B)) {
            Set<Character> charSet = new HashSet<>();
            for (char temp : A.toCharArray()) {
                charSet.add(temp);
            }

            return charSet.size() < A.length();
        }

        List<Integer> difference = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                difference.add(i);
            }
        }

        return difference.size() == 2
                && A.charAt(difference.get(0)) == B.charAt(difference.get(1))
                && A.charAt(difference.get(1)) == B.charAt(difference.get(0));
    }
}
