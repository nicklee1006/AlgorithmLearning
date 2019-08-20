package w2_stack;

public class FixedCapacityArrayImpl implements StackOfStrings {
    private String[] stack;
    private int size;

    public FixedCapacityArrayImpl(int capacity) {
        stack = new String[capacity];
    }

    @Override
    public void push(String item) {
        stack[size++] = item;
    }

    @Override
    public String pop() {
        String item = stack[--size];

        stack[size] = null;

        return item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return 0;
    }
}
