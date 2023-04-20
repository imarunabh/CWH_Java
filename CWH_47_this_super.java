class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a){
        this.a=a;


    }
//    Ekclass(){
//        System.out.println("This is a game");
//    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends Ekclass{
    DoClass(int c){
        super(c);
        System.out.println("Main ek constructor hoon");
    }



}
public class CWH_47_this_super {
    public static void main(String[] args) {
        Ekclass e=  new Ekclass(65);
//        System.out.println(e.returnOne());
//        System.out.println(e.getA());
        DoClass d= new DoClass(5);
        System.out.println(e.getA());


    }
}
