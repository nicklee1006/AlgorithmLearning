package leetcode.medium;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Q54SpiralMatrixTest {

    @Test
    public void spiralOrder() {
        int[][] input1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] input2 = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] input3 = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        Integer[] expected1 = new Integer[]{1,2,3,6,9,8,7,4,5};
        Integer[] expected2 = new Integer[]{1,2,3,4,8,12,11,10,9,5,6,7};

        assertThat(Q54SpiralMatrix.spiralOrder(input1), is(Arrays.asList(expected1)));
        assertThat(Q54SpiralMatrix.spiralOrder(input2), is(Arrays.asList(expected2)));
    }
}