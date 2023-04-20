
public class CH3_Practice {
    public static void main(String[] args) {
        //convert into lower case
        String s="I AM A BOY";
        System.out.println(s.toLowerCase());

        //Replace string with underscore
        String text="I am a boy";
        System.out.println(text.replace(" ","_"));

        //Replace name
        String text2="My name  is <|name|>";
        System.out.println(text2.replace("<|name|>","Harry"));

        //to detect double and triple spaces
        String str="This String contains   double and triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

        //"Dear Harry , This Java Course is nice , Thanks"
        System.out.println("\"Dear Harry ,This Java Course is nice, Thanks\" " );

    }
}
