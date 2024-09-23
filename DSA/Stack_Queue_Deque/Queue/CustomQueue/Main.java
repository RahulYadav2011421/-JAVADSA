package Stack_Queue_Deque.Queue.CustomQueue;

public class Main {
    public static void main(String []args) throws CustomQueueException{
        CustomQueue list=new CustomQueue(4);
        System.out.println(list.isEmpty());
        list.insert(34);
        list.insert(3);
        list.insert(304);
        list.insert(104);
        list.display();
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        System.out.println(list.remove());
        System.out.println(list.front());
    }
}
