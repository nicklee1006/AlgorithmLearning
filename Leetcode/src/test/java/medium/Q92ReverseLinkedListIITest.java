package medium;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.*;

public class Q92ReverseLinkedListIITest {

    @Test
    public void reverseBetween() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode expect1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 4, 3, 2, 5});

        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expect1, Q92ReverseLinkedListII.reverseBetween(input1, 2, 4)));
    }
}