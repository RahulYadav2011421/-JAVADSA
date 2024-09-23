package OOPS;

public class GarbageCollectionExample {
    public static void main(String[] args){
        Student obj;
        for(int i=0;i<1000;i++){
            obj=new Student("new object");
        }
    }
    static class Student{
        String name;
        Student(String name){
            this.name=name;
        }
        protected void finalize() {
            System.out.println("object destroyed");
        }
    }
}
