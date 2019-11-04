package medium;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.*;

public class Q143ReorderListTest {

    @Test
    public void reorderList() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4});
        ListNode input2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4, 5});

        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 4, 2, 3});
        ListNode expected2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 5, 2, 4, 3});

        Q143ReorderList.reorderList(input1);
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected1, input1));

        Q143ReorderList.reorderList(input2);
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected2, input2));
    }
}