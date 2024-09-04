class A{
    public A()
    {
        System.out.println("constructor1");
    }
    public void method1(){
        System.out.println("methode1");
    }
    public void method2(){
        System.out.println("methode2");
    }
    
}
class B extends A{
    public B()
    {
        System.out.println("constructore b");
    }
    @Override
    public void method1(){
        System.out.println("methode1 of b");
    }
    @Override
    public void method2(){
        System.out.println("methode2 of b");
    }
    public void method3()
    {
        System.out.println("hgfds");
    }
}
public class Methode_overriding {
    public static void main(String[] args) {
        // A objA=new A();
        // objA.method1();
        // B objB=new B();
        // objB.method1();
        A objA=new B();
        objA.method3();
        // objA.method3();
    }
    
}
