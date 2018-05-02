package easy;

import org.junit.Test;
import util.ListNode;

import static org.junit.Assert.*;

public class Q203RemoveLinkedListElementsTest {

    @Test
    public void removeElements() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
//        ListNode node3 = new ListNode(2);
//        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode head = Q203RemoveLinkedListElements.removeElements(node1, 6);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}