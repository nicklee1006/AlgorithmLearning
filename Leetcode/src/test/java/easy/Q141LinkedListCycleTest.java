package easy;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Q141LinkedListCycleTest {

    @Test
    public void hasCycle() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArrayWithCycle(new int[]{3, 2, 0, -4}, 1);
        ListNode input2 = LinkedListTestUtil.createLinkedListFromArrayWithCycle(new int[]{1, 2}, 0);
        ListNode input3 = LinkedListTestUtil.createLinkedListFromArrayWithCycle(new int[]{1}, -1);

        assertTrue(Q141LinkedListCycle.hasCycle(input1));
        assertTrue(Q141LinkedListCycle.hasCycle(input2));
        assertFalse(Q141LinkedListCycle.hasCycle(input3));
    }
}