package easy;

import org.junit.Test;
import testutil.LinkedListTestUtil;
import util.ListNode;

import static org.junit.Assert.assertTrue;

public class Q203RemoveLinkedListElementsTest {

    @Test
    public void removeElements() {
        ListNode testCase1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 6, 3, 4, 5, 6});
        ListNode expected1 = LinkedListTestUtil.createLinkedListFromArray(new int[]{1, 2, 3, 4, 5});

        assertTrue(LinkedListTestUtil.isTwoLinkedListEqual(expected1, Q203RemoveLinkedListElements.removeElements(testCase1, 6)));
    }
}