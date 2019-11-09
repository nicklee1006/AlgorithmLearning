package medium;

import java.util.HashMap;
import java.util.Map;

import util.DoubleLinkedList;
import util.DoubleLinkedListNode;

public class Q146LRUCache {
    private int capacity;
    private Map<Integer, DoubleLinkedListNode> nodes = new HashMap<>();
    private DoubleLinkedList doubleLinkedList;

    public Q146LRUCache(int capacity) {
        this.capacity = capacity;
        doubleLinkedList = new DoubleLinkedList();
    }

    public int get(int key) {
        // check if exist
        if (nodes.containsKey(key)) {
            DoubleLinkedListNode node = nodes.get(key);

            // move to the end
            doubleLinkedList.moveNodeToTail(node);

            return node.getValue();
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        // check already exist
        if (nodes.containsKey(key)) {
            DoubleLinkedListNode node = nodes.get(key);

            node.setValue(value);
            doubleLinkedList.moveNodeToTail(node);
        } else {
            // check if reached capacity
            if (nodes.size() == capacity) {
                // remove the one from the head
                DoubleLinkedListNode head = doubleLinkedList.getHead();
                doubleLinkedList.removeNode(head);
                nodes.remove(head.getKey());

                DoubleLinkedListNode newNode = new DoubleLinkedListNode(key, value);
                nodes.put(key, newNode);
                doubleLinkedList.addNodeToTail(newNode);
            } else {
                DoubleLinkedListNode newNode = new DoubleLinkedListNode(key, value);
                nodes.put(key, newNode);
                doubleLinkedList.addNodeToTail(newNode);
            }
        }
    }

    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
}
