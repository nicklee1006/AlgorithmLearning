package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q56MergeIntervalsTest {

    @Test
    public void merge() {
        int[][] input1 = new int[][]{
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] input2 = new int[][]{
                {1, 4},
                {4, 5}
        };

        int[][] expected1 = new int[][]{
                {1, 6},
                {8, 10},
                {15, 18}
        };

        int[][] expected2 = new int[][]{
                {1, 5}
        };

        Assert.assertTrue(Arrays.deepEquals(Q56MergeIntervals.merge(input1), expected1));
        Assert.assertTrue(Arrays.deepEquals(Q56MergeIntervals.merge(input2), expected2));
    }
}