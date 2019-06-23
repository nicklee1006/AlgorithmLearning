package leetcode.easy;

/**
 * 2018.6.4 492. Construct the Rectangle
 * https://leetcode.com/problems/construct-the-rectangle/description/
 *
 * For a web developer, it is very important to know how to design a web page's size. So,
 * given a specific rectangular web page’s area, your job by now is to design a rectangular
 * web page, whose length L and width W satisfy the following requirements:
 *
 * 1. The area of the rectangular web page you designed must equal to the given target area.
 * 2. The width W should not be larger than the length L, which means L >= W.
 * 3. The difference between length L and width W should be as small as possible.
 *
 * You need to output the length L and the width W of the web page you designed in sequence.
 *
 * Note:
 * The given area won't exceed 10,000,000 and is a positive integer
 * The web page's width and length you designed must be positive integers.
 *
 * Solution
 * 1. get t = sqrt(area)
 * 2. find the closest number from t that area % t = 0
 */
public class Q492ConstructTheRectangle {
    public static int[] constructRectangle(int area) {
        int[] result = new int[2];

        int start = (int) Math.sqrt(area);

        while (area % start != 0) {
            start--;
        }

        result[0] = area/start;
        result[1] = start;

        return result;
    }
}
