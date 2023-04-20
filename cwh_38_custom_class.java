class Employee1{
  int id;
  String name;
  int salary;
  public void printDetails(){
      System.out.println("My id is "+id);
      System.out.println("My name is "+name);
  }
  public int getSalary(){
      return salary;
  }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry= new Employee1();
        Employee1 john=new Employee1();
        //setting the attributes
        harry.id=12;
        harry.salary=12;
        harry.name="Code With Harry";
        john.id=14;
        john.salary=56000;
        john.name="John Khandelwal";

        //printing the attributes
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        System.out.println(harry.getSalary());
        john.printDetails();
        System.out.println(john.getSalary());
    }
}
