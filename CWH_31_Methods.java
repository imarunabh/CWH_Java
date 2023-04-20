public class CWH_31_Methods {

     static void change(int a){
         a=15;

    }
    static void change2(int []arr){
         arr[0]=100;
    }



    public static void main(String[] args) {
         CWH_31_Methods obj = new CWH_31_Methods();
         int a=34;
        System.out.println(a);
         change(a);
         int []arr={12,42,34,56,34};
         change2(arr);
        System.out.println(arr[0]);


    }
}
