package easy;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q257BinaryTreePathsTest {

    @Test
    public void binaryTreePaths() {
        List<String> expected = new ArrayList<>();
        expected.add("1->2->5");
        expected.add("1->3");

        TreeNode testCase = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 2, 3, null, 5});

        CollectionUtils.isEqualCollection(expected, Q257BinaryTreePaths.binaryTreePaths(testCase));
    }
}