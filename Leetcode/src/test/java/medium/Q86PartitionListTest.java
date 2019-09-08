package medium;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.*;

public class Q86PartitionListTest {

    @Test
    public void partition() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 4, 3, 2, 5, 2});
        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 2, 4, 3, 5});

        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(Q86PartitionList.partition(input1, 3), expected1));
    }
}