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

    public static ListNode createLinkedListFromArrayWithCycle(int[] array, int pos) {
        if (array.length == 0) {
            return null;
        }

        ListNode head = new ListNode(array[0]);
        ListNode previous = head;

        ListNode afterTail = null;
        if (pos == 0) {
            afterTail = head;
        }

        for (int i = 1; i < array.length; i++) {
            ListNode node = new ListNode(array[i]);

            previous.next = node;
            previous = node;

            if (pos == i) {
                afterTail = node;
            }
        }

        // now previous is the tail
        if (afterTail != null) {
            previous.next = afterTail;
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

    public static boolean isFirstNNodesOfTwoLinkedListEqual(ListNode list1, ListNode list2, int n) {
        int i = 0;
        while (i < n) {
            if (list1 == null || list2 == null) {
                return false;
            }

            if (list1.val != list2.val) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next;

            i++;
        }

        return true;
    }
}
