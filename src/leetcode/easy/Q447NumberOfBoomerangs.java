package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 2018.5.28 Question 447. Number of Boomerangs
 * https://leetcode.com/problems/number-of-boomerangs/description/
 *
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points
 * (i, j, k) such that the distance between i and j equals the distance between i and k (the order
 * of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of
 * points are all in the range [-10000, 10000] (inclusive).
 *
 * Solution
 * 1. Fix start point, loop all other point, get distance
 * 2. since order matters, number = count * (count - 1)
 * 3. Loop all start points
 */
public class Q447NumberOfBoomerangs {
    public static int numberOfBoomerangs(int[][] points) {
        int result = 0;

        Map<Integer, Integer> distanceCount = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }

                int distance = getDistance(points[i], points[j]);

                distanceCount.put(distance, distanceCount.getOrDefault(distance, 0)+1);
            }

            for (int temp : distanceCount.values()) {
                result += temp*(temp-1);
            }

            distanceCount.clear();
        }

        return result;
    }

    private static int getDistance(int[] p1, int[] p2) {
        int dx = p1[0] - p2[0];
        int dy = p1[1] - p2[1];

        return dx*dx + dy*dy;
    }
}
