import java.util.Scanner;

import javax.management.RuntimeErrorException;
class R{
    public void avg(int a,int b)
        throws ArithmeticException{
            System.out.println("avf"+a/b);
        

    }
}
public class Try_catch {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("inter a number");
        // int a=sc.nextInt();
        // System.out.println("inter b number");
        // int b=sc.nextInt();
        // try{
        //     int c=a/b;
        //     System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // finally{
        //     System.out.println(34);
        // }

        // if (age<18){
        //     throw new RuntimeException("sorry you cant vote");
        // }
        // else{
        //     System.out.println("you can vote");
        // }
        R objR=new R();
        objR.avg(2, 0);

    }
    
}
