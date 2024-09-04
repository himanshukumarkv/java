public class Method_overloaded {
    static void fun()
    {
        System.out.println("love you ");
    }
    static void fun(int a)
    {
        System.out.println("love you " + a);
    }
    static void fun(int a, int b)
    {
        System.out.println("love you " +(a+b));
    }
    public static void main(String[] args) {
        fun();
        fun(3000);
        fun(1500, 1500);

    }

}
