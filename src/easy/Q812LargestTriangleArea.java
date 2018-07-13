package easy;

/**
 * 2018.7.13 Question 812. Largest Triangle Area
 * https://leetcode.com/problems/largest-triangle-area/description/
 *
 * You have a list of points in the plane. Return the area of the largest triangle that can
 * be formed by any 3 of the points.
 */
public class Q812LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        double result = 0.0;

        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i+1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    result = Math.max(result, calculateArea(points[i], points[j], points[k]));
                }
            }
        }

        return result;
    }

    private double calculateArea(int[] p1, int[] p2, int[] p3) {
        return Math.abs((p1[0] * (p2[1] - p3[1]) + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1])) / 2.0);
    }
}
