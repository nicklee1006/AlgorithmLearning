package w2_stack;

public class ResizingArrayImpl implements StackOfStrings {
    private String[] stack;
    private int size;

    public ResizingArrayImpl() {
        this.stack = new String[1];
    }

    @Override
    public void push(String item) {
        if (size == stack.length) {
            resize(stack.length * 2);
        }

        stack[size++] = item;
    }

    @Override
    public String pop() {
        String item = stack[--size];

        stack[size] = null;

        if (size < stack.length / 4) {
            resize(stack.length / 2);
        }

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

    private void resize(int capacity) {
        String[] copy = new String[capacity];

        if (size >= 0) {
            System.arraycopy(stack, 0, copy, 0, size);
        }

        stack = copy;
    }
}
