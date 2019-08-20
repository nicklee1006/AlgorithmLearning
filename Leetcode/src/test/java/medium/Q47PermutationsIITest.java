package medium;

import org.junit.Assert;
import org.junit.Test;
import testutil.ListOfListTestUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q47PermutationsIITest {

    @Test
    public void permuteUnique() {
        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(1, 1, 2));
        expected1.add(Arrays.asList(1, 2, 1));
        expected1.add(Arrays.asList(2, 1, 1));

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();
        Assert.assertTrue(util.isTwoListOfListEqual(Q47PermutationsII.permuteUnique(new int[]{1, 1, 2}), expected1));
    }
}