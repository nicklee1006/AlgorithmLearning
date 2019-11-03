package medium;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.*;

public class Q142LinkedListCycleIITest {

    @Test
    public void detectCycle() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArrayWithCycle(new int[]{3, 2, 0, -4}, 1);
        ListNode input2 = LinkedListTestUtil.createLinkedListFromArrayWithCycle(new int[]{1, 2}, 0);
        ListNode input3 = LinkedListTestUtil.createLinkedListFromArrayWithCycle(new int[]{1}, -1);

        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{2, 0, -4});
        ListNode expected2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2});
        ListNode expected3 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1});

        assertTrue(LinkedListTestUtil.isFirstNNodesOfTwoLinkedListEqual(expected1, Q142LinkedListCycleII.detectCycle(input1), 3));
        assertTrue(LinkedListTestUtil.isFirstNNodesOfTwoLinkedListEqual(expected2, Q142LinkedListCycleII.detectCycle(input2), 2));
        assertFalse(LinkedListTestUtil.isFirstNNodesOfTwoLinkedListEqual(expected3, Q142LinkedListCycleII.detectCycle(input3), 1));

    }
}