package OOPS.StaticExample;

public class Main {
    public static void main(String []args){
        Human rahul = new Human(24,"rahul",19999,false);
        Human kunal = new Human(35,"kunall",35343,true);
        System.out.println(Human.population);
    }
}
