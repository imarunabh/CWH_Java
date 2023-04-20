interface sampleInterface{
    void meth1();
    void meth2();

}
 interface   childSampleInterface extends sampleInterface{

    void meth3();
    void meth4();

}
class MySampleClass implements childSampleInterface{//if we don't define the body of meth1 and meth2 is
    //then we need to declare the class as abstract
    @Override
    public void meth3() {
        System.out.println("Meth3");
    }

    @Override
    public void meth4() {
        System.out.println("Meth4");
    }

    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }
}
public class CWH_58_Inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass obj=new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();

    }
}
