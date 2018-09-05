package easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 2018.7.19 Question 844. Backspace String Compare
 * https://leetcode.com/problems/backspace-string-compare/description/
 *
 * Given two strings S and T, return if they are equal when both are typed into empty text editors.
 * # means a backspace character.
 *
 * Solution
 * 1. Use queue to add all chars
 * 2. If meet '#', poll the last
 * 3. compare 2 queues
 */
public class Q844BackspaceStringCompare {
    public static boolean backspaceCompare(String S, String T) {
        Queue<Character> QueusS = new LinkedList<>();
        Queue<Character> QueusT = new LinkedList<>();

        for (char temp : S.toCharArray()) {
            if (temp == '#') {
                ((LinkedList<Character>) QueusS).pollLast();
            } else {
                QueusS.add(temp);
            }

        }

        for (char temp : T.toCharArray()) {
            if (temp == '#') {
                ((LinkedList<Character>) QueusT).pollLast();
            } else {
                QueusT.add(temp);
            }
        }

        StringBuilder stringBuffer = new StringBuilder();
        while (!QueusS.isEmpty()) {
            stringBuffer.append(QueusS.poll());
        }

        S = stringBuffer.toString();

        StringBuilder stringBuffer2 = new StringBuilder();
        while (!QueusT.isEmpty()) {
            stringBuffer2.append(QueusT.poll());
        }

        T = stringBuffer2.toString();

        return S.equals(T);
    }
}
