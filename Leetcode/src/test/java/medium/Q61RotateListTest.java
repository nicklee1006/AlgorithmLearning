package medium;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.assertTrue;

public class Q61RotateListTest {

    @Test
    public void rotateRight() {
        ListNode input1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode input2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{0, 1, 2});
        ListNode input3 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1});

        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{4, 5, 1, 2, 3});
        ListNode expected2 = LinkedListTestUtil.createLinkedListFromArray(new int[]{2, 0, 1});
        ListNode expected3 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1});


        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected1, Q61RotateList.rotateRight(input1, 2)));
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected2, Q61RotateList.rotateRight(input2, 4)));
        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected3, Q61RotateList.rotateRight(input3, 4)));
    }
}