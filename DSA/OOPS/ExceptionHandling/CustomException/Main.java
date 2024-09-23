package OOPS.ExceptionHandling.CustomException;

public class Main {
    public static void main(String []args){
        int a=5;
        int b=0;
        try{
            String name="rahul";
            if(name.equals("rahul")){
                throw new MyException("name is rahul");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
