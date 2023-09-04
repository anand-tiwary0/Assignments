import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Inbuiltstack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<Integer>();
//        stack.push(34);
//        stack.push(34234);
//        stack.push(343);
//        stack.push(34334);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        Queue<Integer> queue = new LinkedList<Integer>();
//        queue.add(4);
//        queue.add(34);
//        queue.add(3434);
//        queue.add(55);
//        queue.add(99);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(324);
        deque.removeLast();
    }
}
