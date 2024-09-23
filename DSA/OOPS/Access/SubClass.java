package OOPS.Access;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String args[]) {
        A obj = new A(123, "rahuuuuul");
        int number = obj.num;
    }
}
