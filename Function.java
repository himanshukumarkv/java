import java.util.Scanner;
public class Function {
    static int diffenceofsumandxor(int arr[],int n)
    {
        // int result=0;
        // result =a+b;
        // return result;
        int sum=0;
        int xor=0;
        for(int i=0;i<n;i+=2)
        {
            sum+=arr[i];
        }
        for(int i=1;i<n;i+=2)
        {
           xor=xor^arr[i];
        }
        return Math.abs(sum-xor);

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // System.out.print("enter first number\n");
        // int a=s.nextInt();
        // System.out.print("enter the second number\n");
        // int b=s.nextInt();
        // System.out.printf("sum=%d",sum(a,b));
        System.out.println("enter the lenght of array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.printf("diffence=%d",diffenceofsumandxor(arr,n));
    }
    
}
