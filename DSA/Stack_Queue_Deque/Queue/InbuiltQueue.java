package Stack_Queue_Deque.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String []args){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(9);
        queue.add(1);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
