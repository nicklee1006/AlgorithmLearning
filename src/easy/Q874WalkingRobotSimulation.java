package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 2018.10.8 Question 874. Walking Robot Simulation
 * https://leetcode.com/problems/walking-robot-simulation/description/
 *
 * A robot on an infinite grid starts at point (0, 0) and faces north.  The robot can receive one of three possible types of commands:
 *
 * -2: turn left 90 degrees
 * -1: turn right 90 degrees
 * 1 <= x <= 9: move forward x units
 * Some of the grid squares are obstacles.
 *
 * The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])
 *
 * If the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)
 *
 * Return the square of the maximum Euclidean distance that the robot will be from the origin.
 */
public class Q874WalkingRobotSimulation {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obs = new HashSet<>();

        for (int[] tempOb : obstacles) {
            obs.add(tempOb[0] + " " + tempOb[1]);
        }

        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // direction 0: north, 1: east, 2: south, 3: west
        int direction = 0;
        int x = 0, y = 0;
        int result = 0;

        for (int tempCommand : commands) {
            if (tempCommand == -1) {
                direction++;

                if (direction == 4) {
                    direction = 0;
                }
            } else if (tempCommand == -2) {
                direction--;

                if (direction == -1) {
                    direction = 3;
                }
            } else {
                while (tempCommand > 0 && !obs.contains((x + dirs[direction][0]) + " " + (y + dirs[direction][1]))) {
                    x += dirs[direction][0];
                    y += dirs[direction][1];

                    tempCommand--;
                }
            }

            result = Math.max(result, x*x + y*y);
        }

        return result;
    }
}
