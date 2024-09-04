public class Oops {
    int id;
    String name;
    int salary;
    void details()
    {
        System.out.println("My name is "+ name);
        System.out.println("and my id is "+ id);
    }
    public int getsalary()
    {
        return salary;
    }
    public static void main(String[] args) {
        Oops obj1= new Oops();
        obj1.id=1;
        obj1.name="himanshu kumar";
        obj1.details();
        Oops obj2= new Oops();
        obj2.id=2;
        obj2.name="pihu kumar";
        obj2.details();
        Oops obj3= new Oops();
        obj3.id=2;
        obj3.name="HK kumar";
        obj3.salary=12000;
        obj3.details();
        int c=obj3.getsalary();
        System.out.println("salary="+c);
        
        

    } 
    
}
