package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15ThreeSumTest {

    @Test
    public void threeSum() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, 0, 1));
        expected.add(Arrays.asList(-1, -1, 2));

        List<List<Integer>> actual = Q15ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        Assert.assertEquals(expected, actual);
    }
}