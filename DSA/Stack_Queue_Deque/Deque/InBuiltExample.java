package Stack_Queue_Deque.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltExample {
    public static void main(String []args){
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(4);
        deque.addLast(10);
        deque.add(6);
        deque.add(8);
        deque.addFirst(1);
        deque.removeFirst();
        deque.removeLast();
    }
}