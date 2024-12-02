package assig3;
import java.util.Stack;
class QueueUsingStacks {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;
    public QueueUsingStacks() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }
    public void enqueue(int item) {
        enqueueStack.push(item);
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.peek();
    }
    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
    public int size() {
        return enqueueStack.size() + dequeueStack.size();
    }
}