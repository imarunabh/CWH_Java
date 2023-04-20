interface Bicycle{
   final  int a=45;//here final is redundant so it doesn't mean whether you are using final or not
    void applyBrake(int decrement );
    void speedup(int increment);
}
interface HornBicycle{
         void blowhornK3g();
        void blownhornmhn ();

}
class AvonCycle implements Bicycle,HornBicycle{
    void Blowhorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    @Override
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }

    @Override
    public void speedup(int increment) {
        System.out.println("Applying SpeedUp");
    }
    @Override
    public void blowhornK3g(){
        System.out.println("Kabhi Khushi Kabhi Ghum pee pee pee pee");

    }
    @Override
    public void blownhornmhn (){
        System.out.println("Main Hoon na Po Po Po ");

    }
}

public class CWH_54_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle1=new AvonCycle();
        cycle1.applyBrake(1);
        System.out.println(cycle1.a);
        //You cannot modify the properties in Interface as they are final
        //cycle1.a=23;-->throws error
        cycle1.blowhornK3g();

    }
}
