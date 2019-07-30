package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18FourSumTest {

    @Test
    public void fourSum() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1,  0, 0, 1));
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2,  0, 0, 2));

        List<List<Integer>> actual = Q18FourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        Assert.assertEquals(expected, actual);
    }
}