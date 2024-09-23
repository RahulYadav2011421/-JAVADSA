package OOPS;

public class PackagesExample {
    public static void main(String []args){
        Student s1=new Student("rahul");
        System.out.println(s1 );
    }
    static class Student{
        String name;

        Student(String name){
            this.name=name;
        }
    }
}
