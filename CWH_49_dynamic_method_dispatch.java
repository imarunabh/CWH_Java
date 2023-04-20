class Phone{
    public void showTime(){
        System.out.println("Time is 8 am ");
    }
    public void on(){
        System.out.println("Turning ON Phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }
    public void on(){
        System.out.println("TUrning On SmartPhone");
    }
}
public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        obj.name();
//        SmartPhone smobj=new SmartPhone();

        Phone obj = new SmartPhone();//Yes it is allowed
//        SmartPhone obj2=new Phone();//Not Allowed
        //obj.music(); Not Allowed
        obj.on();

    }
}
