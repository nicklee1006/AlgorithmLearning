package medium;

import org.junit.Test;
import testutil.TreeTestUtil;
import util.TreeNode;

import static org.junit.Assert.*;

public class Q129SumRootToLeafNumbersTest {

    @Test
    public void sumNumbers() {
        TreeNode input1 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{1, 2, 3});
        TreeNode input2 = TreeTestUtil.createBinaryTreeFromArray(new Integer[]{4, 9, 0, 5, 1});

        assertEquals(25, Q129SumRootToLeafNumbers.sumNumbers(input1));

        Q129SumRootToLeafNumbers.result = 0;
        assertEquals(1026, Q129SumRootToLeafNumbers.sumNumbers(input2));
    }
}