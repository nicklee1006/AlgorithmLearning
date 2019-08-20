package easy;

import java.util.Arrays;

/**
 * 2018.5.29 Question 455. Assign Cookies
 * https://leetcode.com/problems/assign-cookies/description/
 *
 * Assume you are an awesome parent and want to give your children some cookies. But, you
 * should give each child at most one cookie. Each child i has a greed factor gi, which is
 * the minimum size of a cookie that the child will be content with; and each cookie j has a
 * size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will be
 * content. Your goal is to maximize the number of your content children and output the maximum
 * number.
 *
 * Note:
 * You may assume the greed factor is always positive.
 * You cannot assign more than one cookie to one child.
 *
 * Solution
 * 1. Sort g and s
 * 2. Start from s[0],
 * 3. try to content the smaller g as many as possible
 */
public class Q455AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;

        for (int i = 0; i < s.length && result < g.length; i++) {
            if (s[i] >= g[result]) {
                result++;
            }
        }

        return result;
    }
}
