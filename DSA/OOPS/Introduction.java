package OOPS;

import java.sql.SQLOutput;

public class Introduction {
    public static void main(String [] args){
        Student s1=new Student();
        Student s2=new Student(15,"manoj",87.9f);

        s2.greeting();
        s2.changeName("rahul");
//        s1.rollno=14;
//        s1.name="rahul";
//        s1.marks=85.3f;
     //   System.out.println(s1);
        System.out.println(s2.rollno);
        System.out.println(s2.name);
        System.out.println(s2.marks);
    }
    static class Student{
        int rollno;
        String name;
        float marks;

        void greeting(){
            System.out.println("hello my name is : " + this.name);
        }

        void changeName(String name){
            this.name=name;
        }
        Student(){
            this.rollno=12;
            this.name="rahul";
            this.marks=67.5f;
        }
        Student(int rollno,String name,float marks){
            this.rollno=rollno;
            this.name=name;
            this.marks=marks;
        }
    }
}
