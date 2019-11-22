package medium;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.*;

public class Q147InsertionSortListTest {

    @Test
    public void insertionSortList() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{4, 2, 1, 3});
        ListNode input2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{-1, 5, 3, 4, 0});

        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4});
        ListNode expected2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{-1, 0, 3, 4, 5});

        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected1, Q147InsertionSortList.insertionSortList(input1)));
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected2, Q147InsertionSortList.insertionSortList(input2)));
    }
}