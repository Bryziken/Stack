package assig3;
interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    boolean isEmpty();
}