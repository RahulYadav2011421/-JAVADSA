package Stack_Queue_Deque.Queue.CircularQueue;

public class CircularQueue {
    protected int []data;
    protected static final int DEFAULT_SIZE=10;
    protected int front=0;
    protected int end=0;
    protected int size=0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end]=item;
        end++;
        end = end%data.length;
        size++;
        return true;
    }
    public int remove() throws CircularQueueException{
        if(isEmpty()){
            throw new CircularQueueException("Circular Queue is empty");
        }
        int removed=data[front];
        front++;
        front=front%data.length;
        size--;
        return removed;
    }
    public int front() throws CircularQueueException{
        if(isEmpty()){
            throw new CircularQueueException("Circular Queue is empty");
        }
        return data[front];
    }
//    public void display(){
//        for(int i=front;i<end;i++){
//            System.out.print(data[i]+ " -> ");
//        }
//        System.out.println("END");
//    }


    public void display()throws CircularQueueException{
        if(isEmpty()){
            throw new CircularQueueException("Circular Queue is empty");
        }
        int i=front;
        do{
            System.out.print(data[i]+ " -> ");
            i++;
            i= i%data.length;
        }while (i!=end);
        System.out.println("END");
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
