package OOPS.LambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String []args){

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i+1);
        }

        list.forEach((item) -> System.out.println(item*2));
        Consumer<Integer> fun=(item) -> System.out.println(item*3);
        list.forEach(fun);

        Operation sum=(a,b) -> (a+b);
        Operation product=(a,b) -> (a*b);
        Operation sub=(a,b) -> (a-b);

        LambdaFunction myCalci=new LambdaFunction();
        System.out.println(myCalci.Operate(2,4,sum));
        System.out.println(myCalci.Operate(5,8,product));
        System.out.println(myCalci.Operate(54,32,sub));
    }
    private int Operate(int a,int b,Operation op){
        return op.operation(a,b);

    }
    interface Operation{
        int operation(int a,int b);
    }
}