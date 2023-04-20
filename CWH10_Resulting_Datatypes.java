import java.util.ArrayList;
import java.util.List;

public class CWH10_Resulting_Datatypes {
    public static void main(String[] args) {
        String s1="";
        String s2="Sah";


        if(s1.isEmpty()){
            String last=Character.toString(s2.charAt(s2.length()-1));
            String s3="";
            s3="#"+last;
            System.out.println(s3);
        }
        else if (s2.isEmpty()) {
            String first=Character.toString(s1.charAt(0));
            String s3="";
            s3=first+"#";
            System.out.println(s3);

        }
        else {
            String first=Character.toString(s1.charAt(0));
            String last=Character.toString(s2.charAt(s2.length()-1));
            String s3="";
            s3 = first + last;
            System.out.println(s3);
        }


    }
}
