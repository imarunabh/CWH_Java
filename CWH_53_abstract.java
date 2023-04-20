abstract class Parent2{
     public Parent2(){
         System.out.println("Main Base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
     abstract public void greet2();

}

class Child2 extends Parent2{
    @Override
     public void greet(){
         System.out.println("Good Morning");
     }
     @Override
    public void greet2(){
         System.out.println("Good Afternoon");
     }
}
abstract class CHild3 extends Parent2{
    public void parnam(){
        System.out.println("Parnam");
    }
}

public class CWH_53_abstract {
    public static void main(String[] args) {
//        Parent2 p =new Parent2();--->produces error as Parent2 is an abstract class
//        CHild3 e=new CHild3();-->produces error as Parent2 is an abstract class




    }
}
