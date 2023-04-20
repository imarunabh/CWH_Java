class Base1{
    Base1(){
        System.out.println("Main ek constructor hoon");
    }
    Base1(int a){
        System.out.println("The value of the a from the overloaded constructor is :"+a);
    }
    Base1(int a,int b){
        System.out.println("The value of a and b from the overloaded constructor is :"+a+" "+b);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    public int y;

    Derived1(){
        super(2);

        System.out.println("I am Derived constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("The value of x and y  from the overloaded constructor is :"+x+" "+y);

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of Derived constructor ");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an Overloaded constructor of Derived with values  of z as : "+z);
    }

}

public class CWH_46_Constructors_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d= new Derived1(4,8);
        ChildOfDerived cd=new ChildOfDerived();



    }
}
