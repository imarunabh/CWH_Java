class Circle{
    public int radius;
    Circle(){
        System.out.println("I am Circle non parameterized constructor");
    }
    Circle(int r){
        System.out.println("I am Circle Parameterized constructor");
        this.radius=r;

    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cyliner1 extends Circle{
    public int height;
    Cyliner1(int r,int h){
        super(r);
        System.out.println("I am Cylinder1 parameterized constructor");
        this.height=h;

    }
    public double Area(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

public class CWH_52_Ch10prset {
    public static void main(String[] args) {
        //Problem1
       // Circle objC= new Circle(12);
        Cyliner1 obj=new Cyliner1(12,4);

    }
}
