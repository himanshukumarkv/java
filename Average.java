import java.util.Scanner;
public class Average {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first subject marks");
        int a=sc.nextInt();
        System.out.println("enter the secound subject marks");
        int b=sc.nextInt();
        System.out.println("enter the third subject marks");
        int c=sc.nextInt();
        System.out.println("enter the fouth subject marks");
        int d=sc.nextInt();
        System.out.println("enter the fifth subject marks");
        int e=sc.nextInt();
        float percentage=((a+b+c+d+e)*100)/500;
        System.out.print("percentage=");
        System.out.println(percentage);

    }
}
