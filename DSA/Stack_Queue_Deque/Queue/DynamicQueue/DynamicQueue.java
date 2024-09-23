package Stack_Queue_Deque.Queue.DynamicQueue;

import Stack_Queue_Deque.Queue.CircularQueue.CircularQueue;
import Stack_Queue_Deque.Queue.CircularQueue.CircularQueueException;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    public boolean insert(int item){
        if(isFull()){
            int temp[]=new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front + i) % data.length];
            }
            data=temp;
        }
        return super.insert(item);
    }
}
