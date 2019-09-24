package medium;

import org.junit.Test;
import testutil.ListOfListTestUtil;
import testutil.TreeTestUtil;
import util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Q103BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    public void zigzagLevelOrder() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7});

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(20, 9));
        expected.add(Arrays.asList(15, 7));

        ListOfListTestUtil<Integer> listOfListTestUtil = new ListOfListTestUtil<>();
        assertTrue(listOfListTestUtil.isTwoListOfListEqual(expected, Q103BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(input1)));
    }
}