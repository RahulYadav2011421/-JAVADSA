package Stack_Queue_Deque.Stack.CustomStack;

public class Main {
    public static void main(String []args) throws Exception {
       // CustomStack stack=new CustomStack(3);
        DynamicStack stack=new DynamicStack(3);
      //  System.out.println(stack.peek());
        stack.push(12);
        stack.push(56);
        stack.push(344);
        stack.push(20);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
    }
}
