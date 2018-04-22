package easy;

import util.ListNode;

/**
 * 2018.4.22: Question 160. Intersection of Two Linked Lists
 * https://leetcode.com/problems/intersection-of-two-linked-lists/description/
 *
 * Notes:
 *
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 *
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * hint:
 * reset the pointer of one linkedlist to the head of another linkedlist after it reaches the tail node
 * You can prove that: say A length = a + c, B length = b + c, after switching pointer, pointer A will move another b + c steps, pointer B will move a + c more steps, since a + c + b + c = b + c + a + c, it does not matter what value c is. Pointer A and B must meet after a + c + b (b + c + a) steps.
 */
public class Q160IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            if (pointerA == null) {
                pointerA = headB;
            } else {
                pointerA = pointerA.next;
            }

            if (pointerB == null) {
                pointerB = headA;
            } else {
                pointerB = pointerB.next;
            }
        }

        return pointerA;
    }
}
