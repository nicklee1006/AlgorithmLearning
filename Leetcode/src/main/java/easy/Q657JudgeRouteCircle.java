package easy;

/**
 * 2018.6.22 Question 657. Judge Route Circle
 * https://leetcode.com/problems/judge-route-circle/description/
 *
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes
 * a circle, which means it moves back to the original place.
 *
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot
 * moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing
 * whether the robot makes a circle.
 *
 * Solution
 * 1. Use array[2] to record the moves in horizontal and vertical direction
 * 2. if result is 0 for both, then true
 */
public class Q657JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            switch (move) {
                case 'U':
                    result[0]++;
                    break;
                case 'D':
                    result[0]--;
                    break;
                case 'L':
                    result[1]--;
                    break;
                case 'R':
                    result[1]++;
                    break;
            }
        }

        return result[0] == 0 && result[1] == 0;
    }
}
