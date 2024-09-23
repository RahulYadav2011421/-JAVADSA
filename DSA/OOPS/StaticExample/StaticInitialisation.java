package OOPS.StaticExample;

public class StaticInitialisation {
    static int a=4;
    static int b;
    static{
        System.out.println("I'm inside static block");
        b= a*5;
    }
    public static void main(String args[]){
        StaticInitialisation obj = new StaticInitialisation();
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);
        StaticInitialisation.b +=3;
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);
        StaticInitialisation obj2 = new StaticInitialisation();
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);

    }
}
