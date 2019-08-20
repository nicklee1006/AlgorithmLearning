package medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Q48RotateImageTest {

    @Test
    public void rotate() {
        int[][] input = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expected = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        Q48RotateImage.rotate(input);

        Assert.assertTrue(Arrays.deepEquals(input, expected));
    }
}