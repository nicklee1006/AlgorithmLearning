package util;

public class DoubleLinkedList {
    private DoubleLinkedListNode dummyHead = new DoubleLinkedListNode(null, null);
    private DoubleLinkedListNode tail = dummyHead;

    // get head node
    public DoubleLinkedListNode getHead() {
        return dummyHead.next;
    }

    // remove node from the list
    public void removeNode(DoubleLinkedListNode toRemove) {
        // point the previous's next to toRemove's next
        toRemove.prev.next = toRemove.next;

        // check if the toRemove node is tail node
        if (toRemove.next != null) {
            toRemove.next.prev = toRemove.prev;
        } else {
            tail = toRemove.prev;
        }

        // delete toRemove
        toRemove.prev = null;
        toRemove.next = null;
    }

    // add node to the tail
    public void addNodeToTail(DoubleLinkedListNode toAdd) {
        tail.next = toAdd;
        toAdd.prev = tail;
        tail = toAdd;
    }

    // move the node to the tail
    public void moveNodeToTail(DoubleLinkedListNode toMove) {
        removeNode(toMove);
        addNodeToTail(toMove);
    }
}
