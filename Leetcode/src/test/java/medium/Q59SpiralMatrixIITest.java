package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Q59SpiralMatrixIITest {

    @Test
    public void generateMatrix() {
        int[][] expected1 = new int[][]{
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        Assert.assertTrue(Arrays.deepEquals(expected1, Q59SpiralMatrixII.generateMatrix(3)));
    }
}