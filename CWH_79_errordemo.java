import java.util.Scanner;

public class CWH_79_errordemo {
    public static void main(String[] args) {
        //LOGICAL ERROR DEMO
        //write a program to print all the prime number between 1 to 10
        System.out.println(2);
        for(int i=1;i<5;i++){
            System.out.println(2*i+1);
        }

        //RUNTIME ERROR
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k);
    }
}
