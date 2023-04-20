class Base{


    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("I am setting x now");
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}

public class CWH_45_Inheritance {
    public static void main(String[] args) {
        //Object of Base
        Base b= new Base();
        b.setX(4);
        System.out.println(b.getX());

        //creating an object of Derived
        Derived d =new Derived();
        d.setX(43);
        System.out.println(d.getX());

    }
}
