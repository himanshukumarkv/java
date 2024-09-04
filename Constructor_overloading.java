class Employee
{
    private int id;
    private String name;
    public Employee()
    {
        System.out.println(id=4);
        System.out.println(name="himansjh");
    }
    public Employee(int x)
    {
        id=x;
        name="himanshu";
    }
    public Employee(String n)
    {
        id=4;
        name=n;
    }
    public Employee(int x,String n)
    {
        id=x;
        name=n;
    }

    // public void setId(int x)
    // {
    //     this.id=x;
    // }
    public int getId()
    {
        return id;
    }
    // public void setName(String x)
    // {
    //     this.name=x;
    // }
    public String getName()
    {
        return name;
    }

}
public class Constructor_overloading {
    public static void main(String[] args) {
        Employee e=new Employee(44);
        System.out.println(e.getName());
        System.out.println(e.getId());
        
    }
}
