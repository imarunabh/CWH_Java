import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
//        return super.toString()+ "I am toString()";
        return "I am toString";

    }
    @Override
    public String getMessage(){
//        return super.getMessage() + "I am getMessage()";
        return "I am getMessage()";
    }

}
class MaxAgeException extends Exception{
    @Override
    public String toString(){
//        return super.toString()+ "I am toString()";
        return "Age cannot be greater than 125";

    }
    @Override
    public String getMessage(){
//        return super.getMessage() + "I am getMessage()";
        return "Make sure the value of age entered is correct ";
    }

}
public class CWH_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<99){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is an exception");


            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
//                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }




    }
}
