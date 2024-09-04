class Employee
{
    int id;
    String name;
    public Employee()
    {
        System.out.println("default constructor");
        System.out.println(this.id=4);
        System.out.println(this.name="himanshu");
    }

}
public class Constructor {
    public static void main(String[] args) {
        Employee e=new Employee();
        // System.out.println(e.id);
        // System.out.println(e.name);
    }
    
}
// class Employee
// {
//     private int id;
//     private String name;
//     public Employee()
//     {
//         id=4;
//         name="himanshu";
//     }
//     public void setId(int x)
//     {
//         this.id=x;
//     }
//     public int getId()
//     {
//         return this.id;
//     }
//     public void setName(String x)
//     {
//         this.name=x;
//     }
//     public String getName()
//     {
//         return this.name;
//     }

// }
// public class Constructor {
//     public static void main(String[] args) {
//         Employee e=new Employee();

//         System.out.println(e.getId());
//         System.out.println(e.getName());
//     }
    
// }
