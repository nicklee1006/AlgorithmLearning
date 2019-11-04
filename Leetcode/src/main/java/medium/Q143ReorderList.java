package medium;

import java.util.ArrayList;
import java.util.List;

import util.ListNode;

public class Q143ReorderList {
    public static void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();

        if (head == null) {
            return;
        }

        // put all nodes in a list so that we can visit it sequencely
        while (head != null) {
            list.add(head);

            head = head.next;
        }

        int start = 0;
        int tail = list.size() - 1;

        while (start < tail) {
            ListNode front = list.get(start);
            ListNode end = list.get(tail);

            ListNode temp = front.next;
            front.next = end;
            end.next = temp;

            start++;
            tail--;
        }

        list.get(start).next = null;
    }
}
