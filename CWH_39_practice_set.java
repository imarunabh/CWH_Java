class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}
class CellPhone{
    public void Ringing(){
        System.out.println("Ringing.....");
    }
    public void Vibrating(){
        System.out.println("vibrating.....");
    }

}

class Square{
    public static float area(float n){
        return n*n;
    }
    public static float perimeter(float n){
        return 4*n;
    }

}
class Rectangle{
    float side1;
     float side2;
    public float area(){
        return side1*side2;

    }
    public float perimeter(){
        return 2*(side1+side2);
    }

}

class Tommy{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("RUnning");
    }
    public void fire(){
        System.out.println("RUnning");
    }
}


public  class CWH_39_practice_set {
    public static void main(String[] args) {
//        Employee harry= new Employee();
//        harry.setName("CodeWithHarry");
//        System.out.println(harry.getName());
//
//        //Problem 2
//        CellPhone cell=new CellPhone();
//        cell.Ringing();
//        cell.Vibrating();

        //Problem 3

//   Square s= new Square();
//        System.out.println(s.perimeter(4));
//        System.out.println(s.area(5));
//   Rectangle r= new Rectangle();
//   r.side1=10;
//   r.side2=15;
//        System.out.println(r.perimeter());
//        System.out.println(r.area());


        Tommy player1= new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
