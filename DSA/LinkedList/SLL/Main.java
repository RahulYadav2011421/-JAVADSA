package LinkedList.SLL;

public class Main {
    public static void main(String []args){
        SLL list=new SLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(36);
        list.insertFirst(43);
        list.insertLast(100);
        list.insert(50000,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(1));
        list.display();
        list.find(50000);

    }
}
