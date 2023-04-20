import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking input from the user");
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("The sum of number is "+sum);

    }
}
