package OOPS.SingletonExample;

public class Singleton {
    private Singleton(){

    }
    private static Singleton result;
    public static Singleton getResult(){
        if(result == null){
            result = new Singleton();
        }
        return result;
    }
}
