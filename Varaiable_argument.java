public class Varaiable_argument {
    // static int sum(int...arr)
    static int sum(int a,int...arr)
    {
        // int r=0;
        for(int b:arr)
        {
            // r=r+a:
            a=a+b;
        }
        // return r;
        return a; 
    }
    public static void main(String[] args) {
        // System.out.println("sum= "+sum(7,78));
        System.out.printf("sum= %d",sum(2,10));
    }
}
