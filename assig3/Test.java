package assig3;
public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(); // Test ArrayStack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.peek()); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
        Queue<Integer> queue = new ArrayQueue<>(); // Test ArrayQueue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.peek()); // Output: 2
        System.out.println(queue.isEmpty()); // Output: false
    }
}