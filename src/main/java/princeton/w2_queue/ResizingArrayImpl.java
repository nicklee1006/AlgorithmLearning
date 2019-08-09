package princeton.w2_queue;

public class ResizingArrayImpl implements QueueOfStrings {
    private String[] queue;
    private int size;
    int head;
    int tail;

    public ResizingArrayImpl() {
        this.queue = new String[1];
        this.size = 0;
        this.head = 0;
        this.tail = 0;
    }

    @Override
    public void enqueue(String item) {
        if (size == queue.length) {
            resize(queue.length * 2);
        }

        queue[tail] = item;
        tail++;

        if (tail == queue.length) {
            tail = 0;
        }

        size++;
    }

    @Override
    public String dequeue() {
        final String item = queue[head];
        queue[head] = null;

        head++;
        size--;

        if (head == queue.length) {
            head = 0;
        }

        if (size == queue.length / 4) {
            resize(queue.length / 2);
        }

        return item;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];

        for (int i = 0; i < size; i++) {
            copy[i] = queue[(head + i) % queue.length];
        }

        head = 0;
        tail = size;

        queue = copy;
    }

    public static void main(String[] args) {
        QueueOfStrings queue = new ResizingArrayImpl();

        queue.enqueue("3");
        queue.enqueue("4");
        queue.enqueue("5");
        queue.enqueue("6");
        queue.enqueue("7");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
