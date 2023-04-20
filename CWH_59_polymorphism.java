interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k");
    }

}
interface Mywifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int PhoneNumber){
        System.out.println("Calling"+PhoneNumber);
    }
    void Pickcall(){
        System.out.println("Connecting...");
    }
//

}
class MySmartPhone2 extends MyCellPhone2 implements Mywifi2,MyCamera2{
    @Override
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    @Override
    public void recordVideo(){
        System.out.println("Taking Snap");
    }
    //    @Override
//    public void record4kVideo(){
//        System.out.println("Taking snap and recording in 4k");
//    }
    @Override
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList ={"Harry","Prashanth","Anjali56"};
        return networkList;

    }
    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }


}
public class CWH_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1=new MySmartPhone2();//this is a smartphone but,use it as a camera
       // cam1.getNetworks();-->Not allowed
       // cam1.sampleMeth(); can't be used
        cam1.record4kVideo();
        MySmartPhone s=new MySmartPhone();
        s.record4kVideo();
        s.getNetworks();
        s.connectToNetwork("334");
        s.callNumber(3454);
        

    }
}
