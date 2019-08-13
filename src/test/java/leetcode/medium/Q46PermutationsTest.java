package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;
import util.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q46PermutationsTest {

    @Test
    public void permute() {
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(1, 2, 3));
        expected1.add(Arrays.asList(1, 3, 2));
        expected1.add(Arrays.asList(2, 1, 3));
        expected1.add(Arrays.asList(2, 3, 1));
        expected1.add(Arrays.asList(3, 1, 2));
        expected1.add(Arrays.asList(3, 2, 1));

        Assert.assertTrue(ListOfListTestUtil.isTwoListOfListEqual(Q46Permutations.permute(new int[]{1, 2, 3}), expected1));
    }
}