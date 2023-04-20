public class CWH_33_Varargs {
    static int sum(int ...arr){
        int result=0;
       for(int num:arr){
           result+=num;
       }
       return result;
    }

    public static void main(String[] args) {
        sum(4,5);



   }
}
