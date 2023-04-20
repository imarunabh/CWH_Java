interface MyCamera{
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
interface Mywifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int PhoneNumber){
        System.out.println("Calling"+PhoneNumber);
    }
    void Pickcall(){
        System.out.println("Connecting...");
    }
//

}
class MySmartPhone extends MyCellPhone implements Mywifi,MyCamera{
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


}

public class CWH_57_default_methods {
    public static void main(String[] args) {
        MySmartPhone ms =new MySmartPhone();
        ms.record4kVideo();
//        ms.greet()-->Throws an error 
        String[] ar= ms.getNetworks();
        for(String item:ar){
            System.out.println(item);

        }




    }
}
