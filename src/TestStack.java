import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(2);
        integerStack.push(4);
        integerStack.push(6);
        System.out.println(integerStack.size());
        System.out.println("lay ra:" + integerStack.pop());
        System.out.println(integerStack.size());
        System.out.println("lay ra:" + integerStack.peek());
        System.out.println(integerStack.size());
        System.out.println(integerStack);
        System.out.println("-------------------------------------------------");

        Deque<Integer> integerDeque = new ArrayDeque<Integer>();
        integerDeque.push(3);
        integerDeque.push(5);
        integerDeque.push(7);
        System.out.println(integerDeque.size());
        System.out.println("lay ra:" + integerDeque.pop());
        System.out.println(integerDeque.size());
        System.out.println("lay ra:" + integerDeque.peek());
        System.out.println(integerDeque.size());
        System.out.println(integerDeque);
        System.out.println("-------------------------------------------------");

    }
}
