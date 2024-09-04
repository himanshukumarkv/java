class Animal{
    public Animal()
    {
        System.out.println("i am constructor");
    }
    public void makesound()
    {
        System.out.println("animal sound");
    }
}
class Dog extends Animal
{
    public Dog()
    {
        System.out.println("i am dog constructor");
    }
    public void sound()
    {
        System.out.println("barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        d.makesound();
    }
}
