package OOPS.Comparison;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String []args){
        Student rahul=new Student(34,75.8743f);
        Student kunal = new Student(56,98.5f);
        Student mohit = new Student(23,87.5f);
        Student karan = new Student(13,78.5f);
        Student [] list={rahul,kunal,mohit,karan};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.rollno - o2.rollno);
            }
        });
        System.out.println(Arrays.toString(list));

        if(kunal.compareTo(rahul)>0){
            System.out.println(rahul.compareTo(kunal));
            System.out.println("kunal have more marks");
        }
    }
}
