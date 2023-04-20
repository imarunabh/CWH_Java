public class CWH_80_try {
    public static void main(String[] args) {
        int a=60000;
        int b=0;
        //Without try
        System.out.println(a/b);
        //With try
        try {
            int c = a / b;
            System.out.println("We failed to divide:  Reason.");
            System.out.println("The result is " + c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of the program ");
    }
}
