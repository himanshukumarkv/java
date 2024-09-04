class Employee
{
    private int id;
    private String name;
    public void setId(int x)
    {
        this.id=x;

    }
    public int getId()
    {
        return id;
        
    }
    public void setName(String a)
    {
        this.name=a;
        
    }
    public String getName()
    {
        return name;
        
    }
}
public class Priavte_acess_modifiers {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setId(45);
        System.out.println("id ="+e.getId());
        e.setName("himanshu");
        System.out.println("name ="+e.getName());

    }
}
