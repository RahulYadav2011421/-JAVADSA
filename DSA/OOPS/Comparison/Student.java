package OOPS.Comparison;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;
    public Student(int rollno,float marks){
        this.rollno=rollno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return marks + " "+ rollno;
    }
    public int compareTo(Student other){
        int diff=(int)(this.marks - other.marks);
        return diff;
    }
}
