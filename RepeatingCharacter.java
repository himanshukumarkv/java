public class RepeatingCharacter {
    static String rc(String str)
    {
        String r="";
        int n=str.length();
        int a[]=new int[256];
        for(int i=0;i<n;i++)
        {
            a[str.charAt(i)]++;
        }
        for(int j=0;j<n;j++)
        {
            if(a[str.charAt(j)]>1)
            {
                r=r+(str.charAt(j));
                break;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        String str = "heello world";
        System.out.println(rc(str));  
    }
}
