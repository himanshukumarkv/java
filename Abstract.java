abstract class parent{
    public parent()
    {
        System.out.println("i am a constractor");
    }
    public void sayHello()
    {
        System.out.println("methon one of parent class ");
    }
    abstract public void greet();
    abstract public void greet2();

}
class child1 extends parent{
    public void greet()
    {
        System.out.println("1abstract method for parent class which define in child1 class");
    }
    public void greet2()
    {
        System.out.println("2abstract method for parent class which define in child1 class");
    }
}
abstract class child2 extends parent{
    public void th()
    {
        System.out.println("mrthod in child2 class ");
    }
}
public class Abstract {
    public static void main(String[] args) {
        child1 c=new child1();
        c.sayHello();
        c.greet();
        // // Creating an instance of child2
        // child2 c2 = new child2() {
        //     // Anonymous class implementing child2
        //     @Override
        //     public void greet() {
        //         // Implementing abstract method
        //     }

        //     @Override
        //     public void greet2() {
        //         // Implementing abstract method
        //     }
        // };
        
        // c2.th(); // Calling th() method
    }
}
    

