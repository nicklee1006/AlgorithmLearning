package medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Q75SortColorsTest {

    @Test
    public void sortColors() {
        int[] input1 = new int[]{2, 0, 2, 1, 1, 0};
        int[] expected1 = new int[]{0, 0, 1, 1, 2, 2};

        Q75SortColors.sortColors(input1);

        assertArrayEquals(expected1, input1);
    }
}