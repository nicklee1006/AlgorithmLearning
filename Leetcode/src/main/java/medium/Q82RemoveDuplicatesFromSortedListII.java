package medium;

import util.ListNode;

public class Q82RemoveDuplicatesFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode previous = dummyHead;
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val != current.next.val) {
                previous = current;
                current = current.next;
            } else {
                // find next non duplicate node
                ListNode temp = current.next;
                while (temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next;
                }

                previous.next = temp.next;
                current = temp.next;
            }
        }

        return dummyHead.next;
    }
}
