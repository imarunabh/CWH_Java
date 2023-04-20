import java.util.Scanner;
import java.util.Random;
public class ROCK_SCI_PAP {
    public static void main(String[] args) {
        //0 Rock
        //1 Scissor
        //2 Paper
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your choice 0:Rock 1:Scissor 2:Paper");
        int choice=sc.nextInt();
        Random r=new Random();
        int computer=r.nextInt(2);

        if(choice==computer){
            System.out.println(choice);
            System.out.println(computer);
            System.out.println("Draw");
        }
        else if(choice==0&&computer==1||choice==1&&computer==2||choice==2&&computer==0){
            System.out.println(choice);
            System.out.println(computer);
            System.out.println("You Won");
        }
        else{
            System.out.println(choice);
            System.out.println(computer);
            System.out.println("You Lose");
        }


    }
}
