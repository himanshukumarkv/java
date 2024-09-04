import java.util.Scanner;
public class Method_1 {
    static int mysum(int x , int y)
    {
        int result=x+y;
        return result;
    }
    public static void main(String[] args) {
       java.util.Scanner sc=new Scanner(System.in);
       System.out.println("enter the 2 number");
       int a=sc.nextInt(); 
       int b=sc.nextInt();
       int c=mysum(a, b);
       System.out.println("the sum of two number is " + c);

    }
    
}

