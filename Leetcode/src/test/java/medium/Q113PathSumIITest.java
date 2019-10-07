package medium;

import org.junit.Test;
import testutil.ListOfListTestUtil;
import testutil.TreeTestUtil;
import util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q113PathSumIITest {

    @Test
    public void pathSum() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5,4,11,2));
        expected.add(Arrays.asList(5,8,4,5));

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();
        assertTrue(util.isTwoListOfListEqual(expected, Q113PathSumII.pathSum(input1, 22)));
    }
}