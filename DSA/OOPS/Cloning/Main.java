package OOPS.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String []args) throws CloneNotSupportedException{
        Human rahul=new Human(34,"rahul yadav");
       // Human kunal=new Human(rahul);
        Human kunal=(Human)rahul.clone();
        System.out.println(kunal.age + " " + kunal.name);
        System.out.println(Arrays.toString(kunal.arr));
        kunal.arr[0]=100;
        System.out.println(Arrays.toString(rahul.arr));
        System.out.println(Arrays.toString(kunal.arr));
    }
}
