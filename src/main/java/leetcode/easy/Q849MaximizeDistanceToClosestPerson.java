package leetcode.easy;

/**
 * 2018.7.19 Question 849. Maximize Distance to Closest Person
 * https://leetcode.com/problems/maximize-distance-to-closest-person/description/
 *
 * In a row of seats, 1 represents a person sitting in that seat, and 0 represents that the seat is empty.
 *
 * There is at least one empty seat, and at least one person sitting.
 *
 * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized.
 *
 * Return that maximum distance to closest person.
 *
 * Solution
 * 1. if first seat is empty, find max
 * 2. if last seat is empty, find max
 * 3. find max between
 */
public class Q849MaximizeDistanceToClosestPerson {
    public static int maxDistToClosest(int[] seats) {
        int result = 0;

        if (seats[0] == 0) {
            while (seats[result] != 1) {
                result++;
            }
        }

        if (seats[seats.length - 1] == 0) {
            int temp = 0;
            int index = seats.length - 1;

            while (seats[index] == 0) {
                temp++;
                index--;
            }

            result = Math.max(result, temp);
        }

        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                count++;
            } else {
                result = Math.max(result, (count + 1) / 2);
                count = 0;
            }
        }

        return result;
    }
}
