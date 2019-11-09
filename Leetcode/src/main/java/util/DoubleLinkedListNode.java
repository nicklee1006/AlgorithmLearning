package util;

public class DoubleLinkedListNode {
    Integer key;
    Integer value;
    DoubleLinkedListNode next;
    DoubleLinkedListNode prev;

    public DoubleLinkedListNode(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }
}
