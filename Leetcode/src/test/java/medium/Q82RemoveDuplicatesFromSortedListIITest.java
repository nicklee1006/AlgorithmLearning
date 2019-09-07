package medium;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.*;

public class Q82RemoveDuplicatesFromSortedListIITest {

    @Test
    public void deleteDuplicates() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode input2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 1, 1, 2, 3});

        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 5});
        ListNode expected2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{2, 3});

        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(Q82RemoveDuplicatesFromSortedListII.deleteDuplicates(input1), expected1));
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(Q82RemoveDuplicatesFromSortedListII.deleteDuplicates(input2), expected2));
    }
}