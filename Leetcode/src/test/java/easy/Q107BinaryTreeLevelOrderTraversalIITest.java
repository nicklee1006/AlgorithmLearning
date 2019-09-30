package easy;

import org.junit.Test;
import testutil.ListOfListTestUtil;
import testutil.TreeTestUtil;
import util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class Q107BinaryTreeLevelOrderTraversalIITest {

    @Test
    public void levelOrderBottom() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3, 9, 20, null, null, 15, 7});

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(15,7));
        expected.add(Arrays.asList(9,20));
        expected.add(Arrays.asList(3));

        ListOfListTestUtil<Integer> util = new ListOfListTestUtil<>();
        assertTrue(util.isTwoListOfListEqual(expected, Q107BinaryTreeLevelOrderTraversalII.levelOrderBottom(input1)));
    }
}