package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 2018.7.8 Question 771. Jewels and Stones
 *
 * You're given strings J representing the types of stones that are jewels, and S representing the
 * stones you have.  Each character in S is a type of stone you have.  You want to know how many of
 * the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are
 * case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Solution
 * 1. use a hashset to add all chars in J
 * 2. loop S, if set contains char in S, result++
 */
public class Q771JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> jewel = new HashSet<>();

        for (char temp : J.toCharArray()) {
            jewel.add(temp);
        }

        for (char temp : S.toCharArray()) {
            if (jewel.contains(temp)) {
                result++;
            }
        }

        return result;
    }
}
