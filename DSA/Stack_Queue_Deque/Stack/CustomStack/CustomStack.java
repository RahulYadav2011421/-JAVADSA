package Stack_Queue_Deque.Stack.CustomStack;

public class CustomStack {
    protected int []data;
    private static final int DEFAULT_SIZE=10;
    int pointer=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full!!");
            return false;
        }
        pointer++;
        data[pointer]=item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty we can not pop an item");
        }
        int removed=data[pointer];
        pointer--;
        return removed;
    }
    public int  peek() throws StackException{
        if(isEmpty()){
            throw new StackException("stack is empty we can not peek an item");
        }
        return data[pointer];
    }
    public boolean isFull(){
        return pointer==data.length-1;
    }
    private boolean isEmpty(){
        return pointer==-1;
    }
}
