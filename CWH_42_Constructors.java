class MyMainEmployee{
    private int id;
    private String name;
//    public MyMainEmployee(){
//        id=42;
//        name="Your-name-Here";
//    }
    public MyMainEmployee(String myname){
        id=42;
        name=myname;
    }
    public void setName(String n){
        this.name=n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class CWH_42_Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry=new MyMainEmployee("Code With Harry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
