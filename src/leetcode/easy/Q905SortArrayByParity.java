package leetcode.easy;

/**
 * 2018.10.24 Question 905. Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity/description/
 *
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed
 * by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 */
public class Q905SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];

        int begin = 0;
        int end = A.length - 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                result[begin] = A[i];
                begin++;
            } else {
                result[end] = A[i];
                end--;
            }
        }

        return result;
    }
}
