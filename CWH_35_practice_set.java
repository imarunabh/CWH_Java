public class CWH_35_practice_set {
    //Problem 1
//    static void table(int n){
//        int result=n;
//        System.out.println(n);
//        for(int i=2;i<=10;i++){
//            System.out.println(result*i);
//        }
//    static void pattern(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //problem 3
//    static int  natural(int n){
//        if(n==1){
//            return 1;
//        }
//
//
//        return n + natural(n-1);
//    }
    //Problem 4
    static void pattern(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--)
                System.out.print("*");
            System.out.println();
        }

    }



    public static void main(String[] args) {
  //problem 1
//        table(10);
        //problem 2
//        pattern(4);
//        System.out.println(natural(10));
        pattern(4);

    }
}
