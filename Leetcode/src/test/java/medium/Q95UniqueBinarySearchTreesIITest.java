package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Q95UniqueBinarySearchTreesIITest {

    @Test
    public void generateTrees() {
        List<TreeNode> expected = new ArrayList<>();
        TreeNode tree1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, null, 3, 2});
        TreeNode tree2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3, 2, null, 1});
        TreeNode tree3 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{3, 1, null, null, 2});
        TreeNode tree4 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{2, 1, 3});
        TreeNode tree5 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, null, 2, null, 3});

        expected.add(tree1);
        expected.add(tree2);
        expected.add(tree3);
        expected.add(tree4);
        expected.add(tree5);

        assertTrue(isTwoListsOfTreesEqual(expected, Q95UniqueBinarySearchTreesII.generateTrees(3)));
    }

    private boolean isTwoListsOfTreesEqual(List<TreeNode> expect, List<TreeNode> actual) {
        if (expect.size() != actual.size()) {
            return false;
        }

        for (TreeNode treeNode : actual) {
            boolean foundMatch = false;

            // find if this tree exists in expect list
            for (TreeNode node : expect) {
                if (TreeTestUtil.isTwoTreesSame(node, treeNode)) {
                    foundMatch = true;
                    expect.remove(node);
                    break;
                }
            }

            if (!foundMatch) {
                return false;
            }
        }

        return true;
    }
}