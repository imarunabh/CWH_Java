import java.util.Scanner;

public class CWH_81 {
    public static void main(String[] args) {
        int []marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind=sc.nextInt();

        System.out.println("Enter  the number you want to divide value with ");
        int number=sc.nextInt();
        try{
            System.out.println("The value at the array index entered is : "+marks[ind]);
            System.out.println("The value of the array value/number is  " +marks[ind]/number );
        }
        catch (ArithmeticException e ){
            System.out.println("Some ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Some exception ArrayIndexOutOfBoundsException occured !");
            System.out.println(e);
        }
        catch (Exception e ){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
