package assig3;
import java.util.Arrays;
class ArrayStack<T> implements Stack<T> {
    private T[] array;
    private int top;
    @SuppressWarnings("unchecked")
    public ArrayStack() {
        array = (T[]) new Object[10]; // Initial size 10
        top = -1;
    }
    @Override
    public void push(T item) {
        if (top == array.length - 1)
            array = Arrays.copyOf(array, array.length * 2); // Resize if necessary
        array[++top] = item;
    }
    @Override
    public T pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        return array[top--];
    }
    @Override
    public T peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        return array[top];
    }
    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}