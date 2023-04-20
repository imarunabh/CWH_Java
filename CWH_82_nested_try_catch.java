import java.util.Scanner;

public class CWH_82_nested_try_catch {
    public static void main(String[] args) {
        int []marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag ){
            try{
                int ind=sc.nextInt();
                System.out.println("Welcome to video no 82");
                try{
                    System.out.println(marks[ind]);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("This index doesn't exist ");
                    System.out.println("Exception in level 2 ");
                }
            }
            catch (Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program ");


    }
}
