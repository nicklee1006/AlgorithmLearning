package testutil;

import util.ListNode;

public class LinkedListTestUtil {
    public static ListNode createLinkedListFromArray(int[] array) {
        if (array.length == 0) {
            return null;
        }

        ListNode head = new ListNode(array[0]);
        ListNode previous = head;

        for (int i = 1; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);

            previous.next = node;
            previous = node;
        }

        return head;
    }

    public static boolean isTwoLinkedListEqual(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next;
        }

        return list1 == null && list2 == null;
    }
}
