class MyNewThr1 extends Thread{

    public void run(){

       int i=0;
        while(i<56666){

//            System.out.println("I am a thread");
            System.out.println("Thank You1 ");
            i++;
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        int i=0;
        while(i<5666){
            System.out.println("Thank You");
            i++;

        }
    }
}
public class CWH_75_Thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1=new MyNewThr1();
        MyNewThr2 t2=new MyNewThr2();
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();

    }
}
