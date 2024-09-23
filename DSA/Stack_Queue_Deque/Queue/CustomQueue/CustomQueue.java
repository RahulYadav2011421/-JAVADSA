package Stack_Queue_Deque.Queue.CustomQueue;

public class CustomQueue {
    private int[]data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end]=item;
        end++;
        return true;
    }
    public int remove() throws CustomQueueException{
        if(isEmpty()){
            throw new CustomQueueException("no item available to remove");
        }
        int removed=data[0];
        // shifting the element to left side
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front(){
        return data[0];
    }
    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+ " ");
        }
        System.out.println("END");
    }
}
