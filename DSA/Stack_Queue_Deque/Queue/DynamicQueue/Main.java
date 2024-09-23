package Stack_Queue_Deque.Queue.DynamicQueue;

import Stack_Queue_Deque.Queue.CircularQueue.CircularQueueException;

public  class Main {
    public static void main(String []args) throws CircularQueueException {
        DynamicQueue queue=new DynamicQueue();
        queue.insert(10);
        queue.insert(14);
        queue.insert(18);
        queue.insert(22);
        queue.display();
        System.out.println(queue.remove());
        queue.insert(26);
        queue.display();
    }
}
