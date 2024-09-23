package OOPS.Generics;

import java.util.ArrayList;

public class CustomArrayList {
    private int [] data;
    private int DEFAULT_SIZE=10;
    private int size;
    public CustomArrayList(){
        data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isNull()){
            resize();
            }
        data[size++]=num;
        }
        public boolean isNull(){
        return size==data.length;
    }
    public void resize(){
        int []temp=new int[DEFAULT_SIZE * 2];
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
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
        CustomArrayList list2=new CustomArrayList();
        list2.add(45);
        list2.add(54);

    }
}
