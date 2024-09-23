package OOPS.Generics;

import java.util.ArrayList;

public class CustomGenericsArrayList<T> {
    private Object [] data;
    private int DEFAULT_SIZE=10;
    private int size;
    public CustomGenericsArrayList(){

        data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isNull()){
            resize();
            }
        data[size++]=num;
        }
        public boolean isNull(){
        return size==data.length;
    }
    public void resize(){
        Object []temp=new Object[DEFAULT_SIZE * 2];
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public static void main(String []args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(9);
        list.remove(1);
        list.set(1,33);
        list.size();
        System.out.println(list);
        CustomGenericsArrayList list2=new CustomGenericsArrayList();
        list2.add(45);
        list2.add(54);
       
    }
}
