import org.w3c.dom.ls.LSOutput;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}
class Monkey{
     void jump(){
        System.out.println("Jumping...");
    }
     void bite(){
        System.out.println("Biting");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();

}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir!");
    }
    @Override
    public void eat(){
        System.out.println("Eating");

    }

    @Override
    public void sleep(){
        System.out.println("Sleeping");

    }
}
public class CWH_60_ps11 {
    public static void main(String[] args) {
        //Q1 +Q2
        FountainPen pen =new FountainPen();
        pen.changeNib();

        //Q3
        Human harry =new Human();
        harry.sleep();
        Monkey m1=new Human();
        //m1.speak();--> cannot use speak method the reference is monkey which does not  have speak method
        m1.jump();
        m1.bite();
        BasicAnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();

    }
}
