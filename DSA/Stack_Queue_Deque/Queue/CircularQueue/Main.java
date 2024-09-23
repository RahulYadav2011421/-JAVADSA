package Stack_Queue_Deque.Queue.CircularQueue;

public class Main {
    public static void main(String []args) throws CircularQueueException{
        CircularQueue circularQueue=new CircularQueue();
        circularQueue.insert(34);
        circularQueue.insert(304);
        circularQueue.insert(3445);
        circularQueue.insert(395864);
        circularQueue.display();
        System.out.println(circularQueue.remove());
        circularQueue.insert(44);
        circularQueue.display();
        System.out.println(circularQueue.remove());
        circularQueue.insert(545);
        circularQueue.display();
    }
}
