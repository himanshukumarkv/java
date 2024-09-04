import java.util.Scanner;
public class Method_using_obj {
    int mysum(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the secound number");
        int b=sc.nextInt();
        Method_using_obj obj=new Method_using_obj();
        int c=obj.mysum(a, b);
        System.out.println("sum = " + c);
        System.out.println("another two numbers");
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int c1=obj.mysum(a1, b1);
        System.out.println("sum = " + c1);
    }
}
