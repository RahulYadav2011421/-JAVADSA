package LinkedList.DLL;

public class Main {
    public static void main(String []args){
        DLL list=new DLL();
        list.insertFirst(343);
        list.insertFirst(33);
        list.insertFirst(43);
        list.insertFirst(3);
        list.display();
        list.insertLast(3433343);
        list.display();
        list.insert(33,1000);
        list.display();
    }
}
