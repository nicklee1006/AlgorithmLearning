package easy;

import org.junit.Assert;
import org.junit.Test;
import util.ListNode;

public class Q234PalindromeLinkedListTest {

    @Test
    public void isPalindrome() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(3);
//        ListNode node6 = new ListNode(2);
//        ListNode node7 = new ListNode(1);

        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;

//        Assert.assertTrue(Q234PalindromeLinkedList.isPalindrome(node1));
        Assert.assertFalse(Q234PalindromeLinkedList.isPalindrome(node1));
    }
}