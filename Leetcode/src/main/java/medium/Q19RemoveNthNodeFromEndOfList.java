package medium;

import util.ListNode;

public class Q19RemoveNthNodeFromEndOfList {
    /**
     * 1 pass.
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode pointer1 = dummyNode;
        ListNode pointer2 = dummyNode;

        // move first pointer ahead
        for (int i = 0; i <= n; i++) {
            pointer1 = pointer1.next;
        }

        while (pointer1 != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        pointer2.next = pointer2.next.next;

        return dummyNode.next;
    }

    /**
     * 2 pass.
     */
//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        int length = 0;
//        ListNode node = head;
//
//        while (node != null) {
//            length++;
//            node = node.next;
//        }
//
//        // only 1 node in the list
//        if (length == 1) {
//            return null;
//        }
//
//        // index to remove, start from 0
//        int indexToRemove = length - n;
//
//        node = head;
//        // move to the previous node
//        for (int i = 0; i < indexToRemove - 1; i++) {
//            node = node.next;
//        }
//
//        node.next = node.next.next;
//
//        return head;
//    }
}
