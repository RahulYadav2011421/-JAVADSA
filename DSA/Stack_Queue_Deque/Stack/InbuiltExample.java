package Stack_Queue_Deque.Stack;

import java.util.Stack;

public class InbuiltExample {
    public static void main(String []args){
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
