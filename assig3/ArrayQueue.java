package assig3;
import java.util.Arrays;
class ArrayQueue<T> implements Queue<T> {
    private T[] array;
    private int front;
    private int rear;
    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        array = (T[]) new Object[10]; // Initial size 10
        front = rear = -1;
    }
    @Override
    public void enqueue(T item) {
        if (rear == array.length - 1)
            array = Arrays.copyOf(array, array.length * 2); // Resize if necessary
        array[++rear] = item;
        if (front == -1)
            front++;
    }
    @Override
    public T dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        T item = array[front];
        if (front == rear)
            front = rear = -1;
        else
            front++;
        return item;
    }
    @Override
    public T peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        return array[front];
    }
    @Override
    public boolean isEmpty() {
        return front == -1;
    }
}