package easy;

/**
 * 2018.5.29 Question 453. Minimum Moves to Equal Array Elements
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/
 *
 * Given a non-empty integer array of size n, find the minimum number of moves required to
 * make all array elements equal, where a move is incrementing n - 1 elements by 1.
 *
 * hint:
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/discuss/93817/It-is-a-math-question
 */
public class Q453MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int temp : nums) {
            min = Math.min(min, temp);

            sum += temp;
        }

        return sum - min * nums.length;
    }
}
