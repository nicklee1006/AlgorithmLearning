package easy;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import java.util.Objects;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class Q160IntersectionOfTwoLinkedListsTest {

    @Test
    public void getIntersectionNode() {
        // test case 1
        ListNode list1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{4, 1});
        ListNode list2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{5, 0, 1});
        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{8, 4, 5});

        connect(Objects.requireNonNull(list1), expected1);
        connect(Objects.requireNonNull(list2), expected1);

        ListNode actual1 = Q160IntersectionOfTwoLinkedLists.getIntersectionNode(list1, list2);
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected1, actual1));

        // test case 2
        ListNode list3 = LinkedListTestUtil.createLinkedListFromArray(new int[]{0, 9, 1});
        ListNode list4 = LinkedListTestUtil.createLinkedListFromArray(new int[]{3});
        ListNode expected2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{2, 4});

        connect(Objects.requireNonNull(list3), expected2);
        connect(Objects.requireNonNull(list4), expected2);

        ListNode actual2 = Q160IntersectionOfTwoLinkedLists.getIntersectionNode(list3, list4);
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected2, actual2));

        // test case 3
        ListNode list5 = LinkedListTestUtil.createLinkedListFromArray(new int[]{2, 6, 4});
        ListNode list6 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 5});

        ListNode actual3 = Q160IntersectionOfTwoLinkedLists.getIntersectionNode(list5, list6);
        assertNull(actual3);
    }

    private void connect(ListNode list, ListNode tail) {
        while (list.next != null) {
            list = list.next;
        }

        list.next = tail;
    }
}