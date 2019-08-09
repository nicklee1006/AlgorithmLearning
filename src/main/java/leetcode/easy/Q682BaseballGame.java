package leetcode.easy;

import java.util.Stack;

/**
 * 2018.6.27 Question 682. Baseball Game
 * https://leetcode.com/problems/baseball-game/description/
 *
 * You're now a baseball game point recorder.
 *
 * Given a list of strings, each string can be one of the 4 following types:
 *
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 *
 * You need to return the sum of the points you could get in all the rounds.
 *
 * Solution
 * 1. follow the instructions
 */
public class Q682BaseballGame {
    public static int calPoints(String[] ops) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();

                result += temp1 + temp2;

                stack.push(temp2);
                stack.push(temp1);
                stack.push(temp1 + temp2);
            } else if (op.equals("D")) {
                int temp = stack.pop();

                result += temp*2;

                stack.push(temp);
                stack.push(temp * 2);
            } else if (op.equals("C")) {
                int temp = stack.pop();

                result -= temp;
            } else {
                int temp = Integer.parseInt(op);

                result += temp;

                stack.push(temp);
            }
        }

        return result;
    }
}
