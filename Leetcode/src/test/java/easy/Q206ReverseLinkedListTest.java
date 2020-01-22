package easy;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.assertTrue;

public class Q206ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ListNode testCase1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{5, 4, 3, 2, 1});

        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected1, Q206ReverseLinkedList.reverseList(testCase1)));
    }
}