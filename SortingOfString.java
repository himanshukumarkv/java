public class SortingOfString {
    static String rdc(String str)
    {
        int a[]=new int[256];
        String result="";
        for(int i=0;i<str.length();i++)
        {
            a[str.charAt(i)]++;
        }
        for(int j=0;j<256;j++)
        {
            if(a[j]!=0){
            result=result+((char)j);
        }
    }
    return result;
}
    public static void main(String[] args) {
        String str="baaaabbbcdef";
        // String ch=rdc(str);
        System.out.println(rdc(str));
        
    }
}
