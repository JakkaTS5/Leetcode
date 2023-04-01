import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses a = new ValidParentheses();
        System.out.println("nhap vao: ");
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        if (a.isValid(test)) {
            System.out.println("dung");
        } else {
            System.out.println("sai");
        }
    }

    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    charStack.push(ch);
                    break;
                case ')':
                    if (charStack.isEmpty() || charStack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (charStack.isEmpty() || charStack.peek() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (charStack.isEmpty() || charStack.peek() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return charStack.isEmpty();
        // Stack<Character> stack = new Stack<>();

        // // convert string into char array and access the characters using for each
        // loop.
        // for (char ch : s.toCharArray()) {
        // // check ch
        // switch (ch) {
        // // open bracket then push it in stack.
        // // close bracket then pop the item and compare.
        // case '(':
        // case '{':
        // case '[':
        // stack.push(ch);
        // break;
        // case ')':
        // if (stack.isEmpty() || stack.pop() != '(')

        // // if the stack is empty then it means string have no open bracket.
        // // hence it is invalid.
        // {
        // return false;
        // }
        // break;
        // case '}':
        // if (stack.isEmpty() || stack.pop() != '{') {
        // return false;
        // }
        // break;
        // case ']':
        // if (stack.isEmpty() || stack.pop() != '[') {
        // return false;
        // }
        // break;
        // }
        // }

        // // After the loop we have to check one more condition.
        // // return true only if the stack is empty.
        // // if stack is not empty that means we have unused brackets.

        // return stack.isEmpty();
    }
}
